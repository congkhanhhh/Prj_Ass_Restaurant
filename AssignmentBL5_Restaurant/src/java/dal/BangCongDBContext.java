/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.BangCong;
import model.GroupTong;
import model.NhanVien;

/**
 *
 * @author admin
 */
public class BangCongDBContext extends DBContext {

    public ArrayList<BangCong> getAll() {
        ArrayList<BangCong> listBangCong = new ArrayList<>();
        try {

            String sql = "SELECT  [idcong]\n"
                    + "      ,[idNhanvien]\n"
                    + "      ,[socong]\n"
                    + "      ,[ngay]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[BangCong]\n"
                    + "  Order By ngay asc";

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                NhanVienDBContext nhanVienDBContext = new NhanVienDBContext();
                NhanVien nhanVien = nhanVienDBContext.getNhanVienByID(rs.getInt("idNhanvien"));
                BangCong bangCong = new BangCong(rs.getInt("idcong"), nhanVien, rs.getInt("socong"), rs.getDate("ngay"));
                listBangCong.add(bangCong);

            }
        } catch (Exception ex) {

        }
        return listBangCong;

    }
    public static void main(String[] args) {
          BangCongDBContext bangCongDBContext = new BangCongDBContext();
        ArrayList<BangCong> listBangCong = bangCongDBContext.getAll();
        for (BangCong bangCong : listBangCong) {
            System.out.println(bangCong.toString());
        }
    }

}
