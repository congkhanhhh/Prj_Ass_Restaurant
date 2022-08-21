package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import dal.WorkingDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Working;

/**
 *
 * @author NCC
 */
public class timeTable extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LocalDate date1 = java.time.LocalDate.now();
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] year = new int[5];
        int thang = Integer.parseInt(String.valueOf(date1.getMonthValue()));
        int nam = Integer.parseInt(String.valueOf(date1.getYear()));
        for (int i = 0; i < year.length; i++) {
            year[i] = nam - i;
        }
        request.setAttribute("monthT", month);
        request.setAttribute("year", year);
        if (request.getParameter("thang") != null) {
            try {
                if (Integer.parseInt(request.getParameter("thang")) <= 12) {
                    thang = Integer.parseInt(request.getParameter("thang"));
                }
                if (Integer.parseInt(request.getParameter("nam")) <= year[0] && Integer.parseInt(request.getParameter("nam")) >= year[year.length-1]) {
                    nam = Integer.parseInt(request.getParameter("nam"));
                }
            } catch (Exception e) {
            }
        }
        //----- 
        String s = nam + "-" + thang + "-01";
        String e = nam + "-" + (thang + 1) + "-01";
        String thangStr = String.valueOf(thang);
        if (thang < 10) {
            s = nam + "-0" + thang + "-01";
            e = nam + "-0" + (thang + 1) + "-01";
            if (thang == 9) {
                e = nam + "-10" + "-01";
            }
        }
        if (thang == 12) {
            s = nam + "-12" + "-01";
            e = (nam + 1) + "-01" + "-01";
        }

        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<LocalDate> totalDates = new ArrayList<>();
        while (!start.isAfter(end)) {
            totalDates.add(start);
            start = start.plusDays(1);
        }
        request.setAttribute("tuNgay", totalDates.get(0).getDayOfMonth() + " - " + totalDates.get(0).getMonthValue() + " - " + totalDates.get(0).getYear());
        request.setAttribute("denNgay", totalDates.get(totalDates.size() - 2).getDayOfMonth() + " - " + totalDates.get(totalDates.size() - 2).getMonthValue() + " - " + totalDates.get(totalDates.size() - 2).getYear());

        //------
        request.setAttribute("thang", thang);
        request.setAttribute("nam", nam);
        //lay du lieu database
        WorkingDBContext workingDBContext = new WorkingDBContext();
        ArrayList<Working> listWorking = workingDBContext.getWorkByIdEmployees(1);
        request.setAttribute("listWorking", listWorking);
        
        request.getRequestDispatcher("weekTime.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
