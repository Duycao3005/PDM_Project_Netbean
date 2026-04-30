package DAO;

import model.WaterMeter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WaterMeterDao {

    // ================= GET ALL =================
    public List<WaterMeter> getAllMeter() {
        List<WaterMeter> list = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM water_meter";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                WaterMeter m = new WaterMeter();

                m.setMeterId(rs.getInt("meter_id"));
                m.setCustomerId(rs.getInt("customer_id"));
                m.setInstallationDate(rs.getDate("installation_date"));
                m.setMeterType(rs.getString("meter_type"));
                m.setStatus(rs.getString("status"));

                list.add(m);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    // ================= INSERT =================
    public void addMeter(WaterMeter m) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO water_meter(customer_id, installation_date, meter_type, status) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, m.getCustomerId());
            ps.setDate(2, m.getInstallationDate());
            ps.setString(3, m.getMeterType());
            ps.setString(4, m.getStatus());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateMeter(WaterMeter m) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE water_meter SET customer_id=?, installation_date=?, meter_type=?, status=? WHERE meter_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, m.getCustomerId());
            ps.setDate(2, m.getInstallationDate());
            ps.setString(3, m.getMeterType());
            ps.setString(4, m.getStatus());
            ps.setInt(5, m.getMeterId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteMeter(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM water_meter WHERE meter_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}