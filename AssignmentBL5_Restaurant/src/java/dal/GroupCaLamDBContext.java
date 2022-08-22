/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Ca;
import model.GroupCaLam;
import model.KyHieuChamCong;

/**
 *
 * @author admin
 */
public class GroupCaLamDBContext extends DBContext {

    public GroupCaLam getGroupCaLamByID(int id) {
        try {
            String sql = "SELECT [idGRCaLam]\n"
                    + "      ,[idKHChamCong]\n"
                    + "      ,[idCa]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[GroupCaLam]\n"
                    + "  Where idGRCaLam= ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                CaDBContext caDBContext = new CaDBContext();
                Ca ca = caDBContext.getCaByID(rs.getInt("idCa"));
                KyHieuChamCongDBContext kyHieuChamCongDBContext = new KyHieuChamCongDBContext();
                KyHieuChamCong kyHieuChamCong = kyHieuChamCongDBContext.getKyHieuByID(rs.getInt("idKHChamCong"));
                GroupCaLam groupCaLam = new GroupCaLam(rs.getInt("idGRCaLam"), kyHieuChamCong, ca);
                return groupCaLam;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
