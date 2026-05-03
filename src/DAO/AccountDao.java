package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {

    // 1. Hàm kiểm tra đăng nhập (Trả về Role: "ADMIN" hoặc "USER")
    public String checkLogin(String username, String password) {
        String sql = "SELECT role FROM account WHERE username = ? AND password = ?";
        
        // Sử dụng Try-with-resources để tự động đóng kết nối (Chuẩn Clean Code)
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("role"); // Đăng nhập đúng, trả về quyền hạn
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            // Ném lỗi ra ngoài để màn hình giao diện (Main.java) bắt được và hiển thị
            throw new RuntimeException("Lỗi CSDL khi kiểm tra đăng nhập: " + e.getMessage());
        }
        
        return null; // Trả về null nếu sai tài khoản hoặc mật khẩu
    }
    
    // 2. Hàm đăng ký tài khoản mới (Chuẩn bị sẵn cho nút Register)
    public void registerAccount(String username, String password) {
        // Mặc định khi khách hàng tự đăng ký, hệ thống sẽ gán quyền là 'USER'
        String sql = "INSERT INTO account (username, password, role) VALUES (?, ?, 'USER')";
        
        try (Connection conn = JDBCConnection.getJDBCConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi khi tạo tài khoản mới: " + e.getMessage());
        }
    }
}