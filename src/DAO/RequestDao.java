package DAO;

import model.Request;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestDao {
    private final String TABLE_NAME = "maintenance_request";
    
    //COUNT PENDING REQUEST
    public int countPendingRequests() {
    try (java.sql.Connection conn = JDBCConnection.getJDBCConnection();
         java.sql.PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM maintenance_request WHERE status = 'Pending'");
         java.sql.ResultSet rs = ps.executeQuery()) {
        if (rs.next()) return rs.getInt(1);
    } catch (Exception e) { e.printStackTrace(); }
    return 0;
}

    // ================= GET ALL =================
    public List<Request> getAllRequest() {
        List<Request> list = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM maintenance_request";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Request r = new Request();

                r.setRequestId(rs.getInt("request_id"));
                r.setCustomerId(rs.getInt("customer_id"));

                // employee_id có thể NULL
                int empId = rs.getInt("employee_id");
                if (rs.wasNull()) {
                    r.setEmployeeId(null);
                } else {
                    r.setEmployeeId(empId);
                }

                r.setRequestType(rs.getString("request_type"));
                r.setDescription(rs.getString("description"));
                r.setStatus(rs.getString("status"));
                r.setDateCreated(rs.getDate("date_created"));
                r.setDateResolved(rs.getDate("date_resolved"));

                list.add(r);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    // ================= INSERT =================
    public void addRequest(Request r) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO maintenance_request(customer_id, employee_id, request_type, description, status, date_created, date_resolved) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, r.getCustomerId());

            // employee có thể NULL
            if (r.getEmployeeId() == null) {
                ps.setNull(2, java.sql.Types.INTEGER);
            } else {
                ps.setInt(2, r.getEmployeeId());
            }

            ps.setString(3, r.getRequestType());
            ps.setString(4, r.getDescription());
            ps.setString(5, r.getStatus());
            ps.setDate(6, r.getDateCreated());
            ps.setDate(7, r.getDateResolved());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateRequest(Request r) {
        try {
            // Giữ nguyên file kết nối giống PaymentDao
            Connection connection = JDBCConnection.getJDBCConnection();

            // Sửa lại câu lệnh SQL: CHỈ cập nhật status và description
            String sql = "UPDATE maintenance_request SET status=?, description=? WHERE request_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            // Gán 3 giá trị tương ứng vào 3 dấu chấm hỏi
            ps.setString(1, r.getStatus());
            ps.setString(2, r.getDescription());
            ps.setInt(3, r.getRequestId());

            int rs = ps.executeUpdate();
            System.out.println("Updated Request: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteRequest(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM maintenance_request WHERE request_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public List<Request> searchRequests(String keyword) {
        List<Request> list = new ArrayList<>();
        // Lưu ý: CAST sang CHAR để dùng LIKE cho ID
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE CAST(request_id AS CHAR) LIKE ? "
                + "OR CAST(customer_id AS CHAR) LIKE ? "
                + "OR request_type LIKE ? "
                + "OR status LIKE ?";

        try (Connection conn = JDBCConnection.getJDBCConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            String searchKey = "%" + keyword + "%";
            for (int i = 1; i <= 4; i++) {
                ps.setString(i, searchKey);
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Request r = new Request();
                    r.setRequestId(rs.getInt("request_id"));
                    r.setCustomerId(rs.getInt("customer_id"));

                    int empId = rs.getInt("employee_id");
                    r.setEmployeeId(rs.wasNull() ? null : empId);

                    r.setRequestType(rs.getString("request_type"));
                    r.setDescription(rs.getString("description"));
                    r.setStatus(rs.getString("status"));
                    r.setDateCreated(rs.getDate("date_created"));
                    r.setDateResolved(rs.getDate("date_resolved"));
                    list.add(r);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}