/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.GroupLV;
import model.LamViec;
import model.NhanVien;

/**
 *
 * @author admin
 */
public class GroupLamViecDBContext extends DBContext {

    public ArrayList<GroupLV> getAll() {
        ArrayList<GroupLV> listGroupLV = new ArrayList<>();
        try {

            String sql = "SELECT [idGRLV]\n"
                    + "      ,[idNhanvien]\n"
                    + "      ,[idLV]\n"
                    + "      ,[ngay]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[GroupLV]\n"
                    + "  Order by ngay asc";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                NhanVienDBContext nhanVienDBContext = new NhanVienDBContext();
                NhanVien nhanVien = nhanVienDBContext.getNhanVienByID(rs.getInt("idNhanvien"));
                LamViecDBContext lamViecDBContext = new LamViecDBContext();
                LamViec lamViec = lamViecDBContext.getLamViecByID(rs.getInt("idLV"));
                GroupLV groupLV = new GroupLV(rs.getInt("idGRLV"), nhanVien, lamViec, rs.getDate("ngay"));
                listGroupLV.add(groupLV);
            }
        } catch (Exception ex) {

        }
        return listGroupLV;

    }
    public static void main(String[] args) {
        GroupLamViecDBContext groupLamViecDBContext = new GroupLamViecDBContext();
        ArrayList<GroupLV> listGroupLV = groupLamViecDBContext.getAll();
        for (GroupLV groupLV : listGroupLV) {
            System.out.println(groupLV.toString());
        }
    }

}
