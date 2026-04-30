package DAO;

import model.Bill;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillDao {
    
    // COUNT UNPAID BILLS
    public int countUnpaidBills() {
    try (java.sql.Connection conn = JDBCConnection.getJDBCConnection();
         java.sql.PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM bill WHERE status = 'Unpaid'");
         java.sql.ResultSet rs = ps.executeQuery()) {
        if (rs.next()) return rs.getInt(1);
    } catch (Exception e) { e.printStackTrace(); }
    return 0;
}

    // ================= GET ALL =================
    public List<Bill> getAllBill() {
        List<Bill> bills = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM bill";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bill b = new Bill();

                b.setBillId(rs.getInt("bill_id"));
                b.setMeterId(rs.getInt("meter_id"));
                b.setBillingPeriod(rs.getString("billing_period"));
                b.setIssueDate(rs.getDate("issue_date"));
                b.setDueDate(rs.getDate("due_date"));
                b.setTotalAmount(rs.getDouble("total_amount"));
                b.setStatus(rs.getString("status"));

                bills.add(b);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return bills;
    }

    // ================= INSERT =================
    public void addBill(Bill b) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO bill(meter_id, billing_period, issue_date, due_date, total_amount, status) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, b.getMeterId());
            ps.setString(2, b.getBillingPeriod());
            ps.setDate(3, b.getIssueDate());
            ps.setDate(4, b.getDueDate());
            ps.setDouble(5, b.getTotalAmount());
            ps.setString(6, b.getStatus());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateBill(Bill b) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE bill SET meter_id=?, billing_period=?, issue_date=?, due_date=?, total_amount=?, status=? WHERE bill_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, b.getMeterId());
            ps.setString(2, b.getBillingPeriod());
            ps.setDate(3, b.getIssueDate());
            ps.setDate(4, b.getDueDate());
            ps.setDouble(5, b.getTotalAmount());
            ps.setString(6, b.getStatus());
            ps.setInt(7, b.getBillId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteBill(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM bill WHERE bill_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}