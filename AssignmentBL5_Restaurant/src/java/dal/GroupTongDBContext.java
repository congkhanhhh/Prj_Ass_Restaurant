/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.GroupTong;
import model.NhanVien;

/**
 *
 * @author admin
 */
public class GroupTongDBContext extends DBContext {

    public ArrayList<GroupTong> getAll() {
        ArrayList<GroupTong> listGroupTong = new ArrayList<>();
        try {

            String sql = "SELECT [idGRT]\n"
                    + "      ,[idNhanvien]\n"
                    + "      ,[TongCong]\n"
                    + "      ,[NghiPhep]\n"
                    + "      ,[NghiLe]\n"
                    + "      ,[NghiKhongLuong]\n"
                    + "      ,[NgayThuong]\n"
                    + "      ,[NgayLe]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[GroupTong]";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                NhanVienDBContext nhanVienDBContext = new NhanVienDBContext();
                NhanVien nhanVien = nhanVienDBContext.getNhanVienByID(rs.getInt("idNhanvien"));
                GroupTong groupTong = new GroupTong(rs.getInt("idGRT"),
                        nhanVien,
                        rs.getInt("TongCong"),
                        rs.getInt("NghiPhep"),
                        rs.getInt("NghiLe"),
                        rs.getInt("NghiKhongLuong"),
                        rs.getInt("NgayThuong"),
                        rs.getInt("NgayLe"));
                listGroupTong.add(groupTong);

            }
        } catch (Exception ex) {

        }
        return listGroupTong;
    }

    public static void main(String[] args) {
        GroupTongDBContext groupTongDBContext = new GroupTongDBContext();
        ArrayList<GroupTong> listGroupTong = groupTongDBContext.getAll();
        for (GroupTong groupTong : listGroupTong) {
            System.out.println(groupTong.toString());
        }

    }

}
