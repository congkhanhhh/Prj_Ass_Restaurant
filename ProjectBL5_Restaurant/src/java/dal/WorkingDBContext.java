/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import helper.DateTimeHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import java.util.logging.Logger;
import model.Employees;
import model.Working;

/**
 *
 * @author admin
 */
public class WorkingDBContext extends DBContext {

    public ArrayList<Working> getWorkByIdEmployees(int wid) {
        ArrayList<Working> listWorking = new ArrayList<>();
        try {
            String sql = "SELECT [wid]\n"
                    + "      ,[eid]\n"
                    + "      ,[ci1]\n"
                    + "      ,[co1]\n"
                    + "      ,[ci2]\n"
                    + "      ,[co2]\n"
                    + "      ,[ci3]\n"
                    + "      ,[co3]\n"
                    + "      ,[tc1]\n"
                    + "      ,[tc2]\n"
                    + "      ,[hour]\n"
                    + "      ,[total]"
                    + "      ,[date]\n"
                    + "  FROM [dbo].[Working]\n"
                    + "  Where eid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, wid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                EmployeesDBContext employeesDBContext = new EmployeesDBContext();
                Employees employees = employeesDBContext.getEmployeesById(rs.getInt("eid"));
                Working working = new Working();
//                Working working = new Working(
//                        rs.getInt("wid"),
//                        employees,
//                        rs.getTimestamp("ci1") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("ci1")) : null,
//                        rs.getTimestamp("ci2") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("ci2")) : null,
//                        rs.getTimestamp("ci3") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("ci3")) : null,
//                        rs.getTimestamp("co1") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("co1")) : null,
//                        rs.getTimestamp("co2") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("co2")) : null,
//                        rs.getTimestamp("co3") != null ? DateTimeHelper.getTimeStamp(rs.getTimestamp("co3")) : null,
//                        rs.getInt("tc1"),
//                        rs.getInt("tc2"),
//                        rs.getFloat("hour"),
//                        rs.getFloat("total"));
                working.setWid(rs.getInt("wid"));
                working.setEid(employees);
                try {
                    working.setCi1(DateTimeHelper.getTimeStamp(rs.getTimestamp("ci1")));
                } catch (Exception e) {
                }
                try {
                    working.setCi2(DateTimeHelper.getTimeStamp(rs.getTimestamp("ci2")));
                } catch (Exception e) {
                }
                try {
                    working.setCi3(DateTimeHelper.getTimeStamp(rs.getTimestamp("ci3")));
                } catch (Exception e) {
                }
                try {
                    working.setCo1(DateTimeHelper.getTimeStamp(rs.getTimestamp("co1")));
                } catch (Exception e) {
                }
                try {
                    working.setCo2(DateTimeHelper.getTimeStamp(rs.getTimestamp("co2")));
                } catch (Exception e) {
                }
                try {
                    working.setCo3(DateTimeHelper.getTimeStamp(rs.getTimestamp("co3")));
                } catch (Exception e) {
                }
                try {
                    working.setTc1(rs.getInt("tc1"));
                } catch (Exception e) {
                }
                try {
                    working.setTc2(rs.getInt("tc2"));
                } catch (Exception e) {
                }

                try {
                    working.setDayW(rs.getDate("date"));
                } catch (Exception e) {
                }
                
                Calendar cal = Calendar.getInstance();
                cal.set(working.getDayW().getYear(), working.getDayW().getMonth(), working.getDayW().getDay());
                DateFormat formatter = new SimpleDateFormat("EEEE", Locale.getDefault());
                working.setDob(String.valueOf(formatter.format(cal.getTime())));
                
                working.setHour(rs.getFloat("hour"));
                working.setTotal(rs.getFloat("total"));

                listWorking.add(working);
            }
        } catch (Exception ex) {

        }
        return listWorking;
    }

    public static void main(String[] args) {
        WorkingDBContext workingDBContext = new WorkingDBContext();
        ArrayList<Working> listWorking = workingDBContext.getWorkByIdEmployees(1);
        for (Working working : listWorking) {
//          
            Calendar cal = Calendar.getInstance();
            cal.set(working.getDayW().getYear(), working.getDayW().getMonth(), working.getDayW().getDay());
            DateFormat formatter = new SimpleDateFormat("EEEE", Locale.getDefault());
            String a = String.valueOf(formatter.format(cal.getTime()));
            System.out.println(a);
//            System.out.println(working.getDayW().getYear());
        }
    }
}
