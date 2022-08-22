/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Ca;

/**
 *
 * @author admin
 */
public class CaDBContext extends DBContext {

    public Ca getCaByID(int id) {
        try {
            String sql = "SELECT [idCa]\n"
                    + "      ,[tenCa]\n"
                    + "  FROM [TimeSheet_Restaurant].[dbo].[Ca]\n"
                    + "  Where idCa=?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {               
                Ca ca = new Ca(rs.getInt("idCa"), rs.getString("tenCa"));
                return ca;
            }
        } catch (Exception ex) {

        }
        return null;

    }

}
