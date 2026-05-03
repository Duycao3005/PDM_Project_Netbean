/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
    
    // COUNT Customer
    public int countCustomer() {
    try (java.sql.Connection conn = JDBCConnection.getJDBCConnection();
         java.sql.PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM customer");
         java.sql.ResultSet rs = ps.executeQuery()) {
        if (rs.next()) return rs.getInt(1);
    } catch (Exception e) { e.printStackTrace(); }
    return 0;
}

    // ================= GET ALL =================
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM customer";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Customer c = new Customer();

                c.setCustomerId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                c.setAddress(rs.getString("address"));
                c.setCustomerType(rs.getString("customer_type"));

                customers.add(c);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return customers;
    }

    // ================= INSERT =================
    public void addCustomer(Customer c) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO customer(name, phone, email, address, customer_type) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, c.getName());
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getAddress());
            ps.setString(5, c.getCustomerType());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateCustomer(Customer c) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE customer SET name=?, phone=?, email=?, address=?, customer_type=? WHERE customer_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, c.getName());
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getAddress());
            ps.setString(5, c.getCustomerType());
            ps.setInt(6, c.getCustomerId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteCustomer(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM customer WHERE customer_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
