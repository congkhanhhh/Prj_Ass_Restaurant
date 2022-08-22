/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.BangCongDBContext;
import dal.GroupLamViecDBContext;
import dal.GroupTongDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.BangCong;
import model.GroupLV;
import model.GroupTong;

/**
 *
 * @author admin
 */
public class TimeSheet extends HttpServlet {
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        GroupLamViecDBContext groupLamViecDBContext = new GroupLamViecDBContext();
        ArrayList<GroupLV> listGroupLV = groupLamViecDBContext.getAll();
        GroupTongDBContext groupTongDBContext = new GroupTongDBContext();
        ArrayList<GroupTong> listGroupTong = groupTongDBContext.getAll();
        BangCongDBContext bangCongDBContext = new BangCongDBContext();
        ArrayList<BangCong> listBangCong = bangCongDBContext.getAll();
        request.setAttribute("listGroupLV", listGroupLV);
        request.setAttribute("listGroupTong", listGroupTong);
        request.setAttribute("listBangCong", listBangCong);
        
        
//        PrintWriter o = response.getWriter();
//        for (GroupTong listGT : listGroupTong) {
//            for (GroupLV listGRLV : listGroupLV) {
//                if (listGRLV.getIdNhanVien().getIdNhanVien() == listGT.getIdNhanVien().getIdNhanVien()) {
//                    if (listGRLV.getIdLamViec().getIdCaLam().getIdCa().getIdCa() ==1) {
//                             o.println(listGRLV.getIdLamViec().getIdCaLam().getIdKH().getTenKH());
//                    }
//               
//                }
//            }
//        }
//        
        
        
        
        
        
        
        
        int size = 0;
        for (BangCong bangCong : listBangCong) {
            if (bangCong.getIdNhanVien().getIdNhanVien() ==1) {
                size++;
            }
        }
        request.setAttribute("size",size );
        request.getRequestDispatcher("View.jsp").forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
