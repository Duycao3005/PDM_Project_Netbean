package DAO;

import model.WaterUsage;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsageDao {

    // ================= GET ALL =================
    public List<WaterUsage> getAllUsage() {
        List<WaterUsage> list = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM water_usage";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                WaterUsage u = new WaterUsage();

                u.setUsageId(rs.getInt("usage_id"));
                u.setMeterId(rs.getInt("meter_id"));
                u.setReadingDate(rs.getDate("reading_date"));
                u.setPreviousReading(rs.getDouble("previous_reading"));
                u.setCurrentReading(rs.getDouble("current_reading"));

                list.add(u);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    // ================= INSERT =================
    public void addUsage(WaterUsage u) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO water_usage(meter_id, reading_date, previous_reading, current_reading) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, u.getMeterId());
            ps.setDate(2, u.getReadingDate());
            ps.setDouble(3, u.getPreviousReading());
            ps.setDouble(4, u.getCurrentReading());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateUsage(WaterUsage u) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE water_usage SET meter_id=?, reading_date=?, previous_reading=?, current_reading=? WHERE usage_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, u.getMeterId());
            ps.setDate(2, u.getReadingDate());
            ps.setDouble(3, u.getPreviousReading());
            ps.setDouble(4, u.getCurrentReading());
            ps.setInt(5, u.getUsageId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteUsage(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM water_usage WHERE usage_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}