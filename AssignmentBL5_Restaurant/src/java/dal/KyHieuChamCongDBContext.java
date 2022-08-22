/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.KyHieuChamCong;

/**
 *
 * @author admin
 */
public class KyHieuChamCongDBContext extends DBContext {

    public KyHieuChamCong getKyHieuByID(int id) {
        try {
            String sql = "SELECT [idKHChamCong]\n"
                    + "      ,[tenKyHieu]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[KyHieuChamCong]\n"
                    + "  Where idKHChamCong=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
               KyHieuChamCong kyhieuchamcong = new KyHieuChamCong(rs.getInt("idKHChamCong"), rs.getString("tenKyHieu"));
                return kyhieuchamcong;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
