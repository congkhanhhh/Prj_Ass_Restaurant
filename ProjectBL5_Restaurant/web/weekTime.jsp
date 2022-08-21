<%-- 
    Document   : weekTime
    Created on : Aug 16, 2022, 5:00:22 PM
    Author     : NCC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                min-width: 100px;
                min-height: 100px;
                margin-right: auto;
                margin-left: auto;
                box-sizing: border-box;
            }
            table td{
                padding:  4px;
            }
           
        </style>
    </head>

    <body>
        <form action="timeTable" method="get">
            Tháng: 
            <select name="thang">
                <c:forEach items="${monthT}" var="t">
                    <option value="${t}" <c:if test="${t==thang}">selected</c:if> >${t}</option>
                </c:forEach>
            </select>
            Năm: 
            <select name="nam">
                <c:forEach items="${year}" var="y">
                    <option value="${y}" <c:if test="${y==nam}">selected</c:if> >${y}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Search">
        </form>


        <h2 style="text-align: center; text-transform: uppercase; border-bottom: grey 1px dotted;">Chi tiết chấm công</h2>
        <h4 style="text-align: center; padding-top: 0; ">Từ ngày ${tuNgay} đến ngày ${denNgay}</h4>
        <table border="1">
            <tr>
                <th>Mã N.Viên</th>
                <th>Tên nhân viên</th>
                <th>Phòng ban</th>
                <th>Ngày</th>
                <th>Thứ</th>
                <th>Vào 1 </th>
                <th>Ra 1 </th>
                <th>Vào 2 </th>
                <th>Ra 2 </th>
                <th>Vào 3 </th>
                <th>Ra 3 </th>
                <th>Công</th>
                <th>Giờ</th>
                <th>Vào</th>
                <th>Ra sớm</th>
                <th>TC1</th>
                <th>TC2</th>
                <th>Tên ca</th>
                <th>Tổng giờ</th>
            </tr>
            <tr style="text-align: center;">
                <td>1</td>
                <td>Nguyen Van A</td>
                <td>Nhân Viên</td>
                <td>1/9/2022</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </body>

</html>