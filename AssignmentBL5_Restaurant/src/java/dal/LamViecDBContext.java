/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.GroupCaLam;
import model.LamViec;


/**
 *
 * @author admin
 */
public class LamViecDBContext extends DBContext {

    public LamViec getLamViecByID(int id) {
        try {
            String sql = "SELECT [idLV]\n"
                    + "      ,[idGRCaLam]\n"
                    + "      ,[Cong]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[LamViec]\n"
                    + "  Where idLV=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                GroupCaLamDBContext groupCaLamDBContext = new GroupCaLamDBContext();
                GroupCaLam groupCaLam = groupCaLamDBContext.getGroupCaLamByID(rs.getInt("idGRCaLam"));
                LamViec lamViec = new LamViec(rs.getInt("idLV"),groupCaLam ,rs.getInt("Cong"));
                return lamViec;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
