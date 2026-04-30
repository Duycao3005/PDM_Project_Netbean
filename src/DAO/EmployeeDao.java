/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

    // ================= GET ALL =================
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM employee";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();

                e.setEmployeeId(rs.getInt("employee_id"));
                e.setName(rs.getString("name"));
                e.setPhone(rs.getString("phone"));
                e.setRole(rs.getString("role"));

                employees.add(e);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return employees;
    }

    // ================= INSERT =================
    public void addEmployee(Employee e) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "INSERT INTO employee(name, phone, role) VALUES (?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getPhone());
            ps.setString(3, e.getRole());

            int rs = ps.executeUpdate();
            System.out.println("Inserted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= UPDATE =================
    public void updateEmployee(Employee e) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "UPDATE employee SET name=?, phone=?, role=? WHERE employee_id=?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getPhone());
            ps.setString(3, e.getRole());
            ps.setInt(4, e.getEmployeeId());

            int rs = ps.executeUpdate();
            System.out.println("Updated: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteEmployee(int id) {
        try {
            Connection connection = JDBCConnection.getJDBCConnection();

            String sql = "DELETE FROM employee WHERE employee_id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            System.out.println("Deleted: " + rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}