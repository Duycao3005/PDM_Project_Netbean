package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Bill;

public class BillDao {

    public int getTotalBillCount() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM bill WHERE status = 'Paid'";
        
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            if (rs.next()) {
                count = rs.getInt(1); // Lấy con số kết quả từ SQL
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    // Hàm đếm số hóa đơn CHƯA thanh toán
    public int getUnpaidBillCount() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM bill WHERE status = 'Unpaid'";
        
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            if (rs.next()) {
                count = rs.getInt(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
    // 1. Lấy toàn bộ Hóa đơn (Đã chuyển thành List<Bill> thay vì ArrayList<String>)
    public List<Bill> getAllBill() {
        List<Bill> list = new ArrayList<>();
        String sql = "SELECT * FROM bill";
        
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Bill b = new Bill();
                b.setBillId(rs.getInt("bill_id"));
                b.setMeterId(rs.getInt("meter_id"));
                b.setBillingPeriod(rs.getString("billing_period"));
                
                // Lưu ý: Nếu Database của bạn không có cột issue_date và due_date,
                // bạn có thể xóa hoặc comment 2 dòng này lại nhé!
                b.setIssueDate(rs.getDate("issue_date"));
                b.setDueDate(rs.getDate("due_date"));
                
                b.setTotalAmount(rs.getDouble("total_amount"));
                b.setStatus(rs.getString("status"));
                
                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // 2. Thêm Hóa đơn
    public void addBill(Bill b) {
        String sql = "INSERT INTO bill (meter_id, billing_period, issue_date, due_date, total_amount, status) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, b.getMeterId());
            ps.setString(2, b.getBillingPeriod());
            ps.setDate(3, b.getIssueDate());
            ps.setDate(4, b.getDueDate());
            ps.setDouble(5, b.getTotalAmount());
            ps.setString(6, b.getStatus());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi Khóa ngoại (Sai Meter ID): " + e.getMessage());
        }
    }

    // 3. Sửa Hóa đơn
    public void updateBill(Bill b) {
        String sql = "UPDATE bill SET meter_id=?, billing_period=?, issue_date=?, due_date=?, total_amount=?, status=? WHERE bill_id=?";
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, b.getMeterId());
            ps.setString(2, b.getBillingPeriod());
            ps.setDate(3, b.getIssueDate());
            ps.setDate(4, b.getDueDate());
            ps.setDouble(5, b.getTotalAmount());
            ps.setString(6, b.getStatus());
            ps.setInt(7, b.getBillId());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi Cập nhật: " + e.getMessage());
        }
    }

    // 4. Xóa Hóa đơn
    public void deleteBill(int id) {
        String sql = "DELETE FROM bill WHERE bill_id = ?";
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi Ràng buộc (Hóa đơn này đang có Payment): " + e.getMessage());
        }
    }

    // 5. Đếm hóa đơn chưa thanh toán (Dùng cho màn hình Dashboard)
    public int countUnpaidBills() {
        String sql = "SELECT COUNT(*) FROM bill WHERE status = 'Unpaid'";
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
