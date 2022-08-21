/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Department;
import model.Employees;

/**
 *
 * @author admin
 */
public class DepartmentDBContext extends DBContext {

    public Department getDepartmentByID(int id) {
        try {
            String sql = "SELECT  [did]\n"
                    + "      ,[dname]\n"
                    + "  FROM [restaurant_management].[dbo].[Department]\n"
                    + "  Where did = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {              
                Department department = new Department(rs.getInt("did"), rs.getString("dname"));
                return department;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
