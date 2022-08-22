/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.PhongBan;

/**
 *
 * @author admin
 */
public class PhongBanDBContext extends DBContext {

    public PhongBan getPhongBanByID(int id) {
        try {
            String sql = "SELECT  [idPhongBan]\n"
                    + "      ,[tenPhongBan]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[PhongBan]\n"
                    + "  Where idPhongBan=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                PhongBan phongban = new PhongBan(rs.getInt("idPhongBan"), rs.getString("tenPhongBan"));
                return phongban;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
