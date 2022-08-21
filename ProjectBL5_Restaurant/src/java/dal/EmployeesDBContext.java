/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Department;
import model.Employees;
import model.Working;

/**
 *
 * @author admin
 */
public class EmployeesDBContext extends DBContext {

    public Employees getEmployeesById(int id) {
        try {
            String sql = "SELECT  [eid]\n"
                    + "      ,[ename]\n"
                    + "      ,[did]\n"
                    + "  FROM [restaurant_management].[dbo].[Employees]\n"
                    + "  Where eid =?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DepartmentDBContext departmentDB = new DepartmentDBContext();
                Department department = departmentDB.getDepartmentByID(rs.getInt("did"));
                Employees employees = new Employees(rs.getInt("eid"), rs.getString("ename"), department);
                return employees;
            }
        } catch (Exception ex) {

        }
        return null;
    }

}
