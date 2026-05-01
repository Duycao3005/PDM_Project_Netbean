
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    public static Connection getJDBCConnection() {
        final String url = "jdbc:mysql://localhost:3306/water_supply_manage_system";
        final String user = "root";
        final String password = "Hbao09072006";

        try {
            // Với Driver 9.7.0 và Java 25, bạn có thể nạp trực tiếp thế này
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            // Catch Exception tổng quát để tránh lỗi "never thrown"
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = getJDBCConnection();
        if (conn != null) {
            System.out.println("Ket noi thanh cong roi nhe!");
        } else {
            System.out.println("Ket noi van that bai, hay kiem tra MySQL Server đa bat chua.");
        }
    }
}
