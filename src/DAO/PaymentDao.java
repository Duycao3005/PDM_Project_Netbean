package DAO;

import model.Payment;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentDao {
    
    //SUM REVENUE
    public double sumRevenue() {
    try (java.sql.Connection conn = JDBCConnection.getJDBCConnection();
         java.sql.PreparedStatement ps = conn.prepareStatement("SELECT SUM(amount) FROM payment");
         java.sql.ResultSet rs = ps.executeQuery()) {
        if (rs.next()) return rs.getDouble(1);
    } catch (Exception e) { e.printStackTrace(); }
    return 0.0;}

    // ================= GET ALL =================
    public List<Payment> getAllPayment() {
        List<Payment> payments = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM payment";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Payment p = new Payment();

                p.setPaymentId(rs.getInt("payment_id"));
                p.setBillId(rs.getInt("bill_id"));
                p.setPaymentDate(rs.getDate("payment_date"));
                p.setAmount(rs.getDouble("amount"));
                p.setPaymentMethod(rs.getString("payment_method"));

                payments.add(p);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error database: " + ex.getMessage());
        }

        return payments;
    }

    // ================= INSERT =================
    public void addPayment(Payment p) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO payment(bill_id, payment_date, amount, payment_method) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, p.getBillId());
            ps.setDate(2, p.getPaymentDate());
            ps.setDouble(3, p.getAmount());
            ps.setString(4, p.getPaymentMethod());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updatePayment(Payment p) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE payment SET bill_id=?, payment_date=?, amount=?, payment_method=? WHERE payment_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, p.getBillId());
            ps.setDate(2, p.getPaymentDate());
            ps.setDouble(3, p.getAmount());
            ps.setString(4, p.getPaymentMethod());
            ps.setInt(5, p.getPaymentId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error database: " + ex.getMessage());
        }
    }

    // ================= DELETE =================
    public void deletePayment(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM payment WHERE payment_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}