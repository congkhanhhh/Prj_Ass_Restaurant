/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NhanVien;
import model.PhongBan;

/**
 *
 * @author admin
 */
public class NhanVienDBContext extends DBContext {

    public NhanVien getNhanVienByID(int id) {
        try {
            String sql = "SELECT [idNhanvien]\n"
                    + "      ,[tenNhanvien]\n"
                    + "      ,[idPhongBan]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[NhanVien]\n"
                    + "  Where idNhanvien=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                PhongBanDBContext phongBanDBContext = new PhongBanDBContext();
                PhongBan phongBan = phongBanDBContext.getPhongBanByID(rs.getInt("idPhongBan"));
                NhanVien nhanVien = new NhanVien(rs.getInt("idNhanvien"), rs.getString("tenNhanvien"), phongBan);
                return nhanVien;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
