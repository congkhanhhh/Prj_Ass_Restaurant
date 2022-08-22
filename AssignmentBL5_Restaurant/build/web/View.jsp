<%-- 
    Document   : View
    Created on : Aug 22, 2022, 2:17:06 AM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <style>
            body {
                font-size: medium;
            }

            table,
            th,
            td {
                border: 1px solid black;
                padding: 10px;
                text-align: center;
            }

            table {
                border-collapse: collapse;
            }

            .xanh {
                background-color: rgb(29, 206, 82);
            }

            .xanhNhe {
                background-color: rgb(196, 215, 155)
            }

            .cam {
                background-color: rgb(235, 172, 101);
            }

            .vang {
                background-color: yellow;
            }
        </style>

    </head>

    <body>

        <table border="1">
            <tr>
                <th rowspan="2" class="xanh">TT</th>
                <th rowspan="2" class="xanh">Họ và tên</th>
                <th rowspan="2" class="xanh">Chức vụ</th>
                <th rowspan="2" class="xanh">Ca</th>
                <th colspan="${size}" rowspan="1" class="xanh">Ngày trong tháng</th>
                <th rowspan="2" class="cam">Tổng công</th>
                <th colspan="3" class="cam">Nghỉ</th>
                <th class="cam">TC1</th>
                <th class="cam">TC2</th>
            </tr>
            <tr>
                <c:forEach items="${listBangCong}" var="liBC">
                    <c:if test="${liBC.idNhanVien.idNhanVien == 1}">
                        <td>${liBC.ngayc}</td>
                    </c:if>
                </c:forEach>
                <th class="cam">Nghỉ Phép</th>
                <th class="cam">Nghỉ Lễ</th>
                <th class="cam">Nghỉ Không Lương</th>
                <th class="cam">Ngày Thường</th>
                <th class="cam">Ngày Lễ</th>
            </tr>
            <!-- Start -->
            <c:forEach items="${listGroupTong}" var="listGT"> 

                <!-- for GroupTong -->
                <tr>
                    <td rowspan="3" class="xanhNhe">${listGT.idNhanVien.idNhanVien}</td>
                    <td rowspan="3" class="xanhNhe">${listGT.idNhanVien.tenNhanVien}</td>
                    <td rowspan="3" class="xanhNhe">${listGT.idNhanVien.idPhongBan.tenPhongBan}</td>
                    <td>Sáng (7:00-11:00)</td>
                    <!-- for GroupLV  -->
                    <c:forEach items="${listGroupLV}" var="listGRLV">
                        <!-- if GroupTong.nv == GroupLV.nv -->
                        <c:if test="${listGRLV.getIdNhanVien().getIdNhanVien() == listGT.getIdNhanVien().getIdNhanVien()}">
                            <!-- if  GroupLV.idLV.idGRCaLam.idCa == 1 -->
                            <c:if test="${listGRLV.getIdLamViec().getIdCaLam().getIdCa().getIdCa() ==1}">
                                <td>${listGRLV.getIdLamViec().getIdCaLam().getIdKH().getTenKH()}</td>
                            </c:if>
                        </c:if>
                    </c:forEach>
                    <!--  -->
                    <td rowspan="4" class="cam">${listGT.getTongCong()}</td>  <!-- Tổng công -->
                    <td rowspan="4" class="cam">${listGT.getNghiPhep()}</td> <!--  Nghỉ Phép -->
                    <td rowspan="4" class="cam">${listGT.getNgayLe()}</td> <!--  Nghỉ Lễ -->
                    <td rowspan="4" class="cam">${listGT.getNghiKhongLuong()}</td> <!--  Nghỉ Không Lương -->
                    <td rowspan="4" class="cam">${listGT.getNgayThuong()}</td> <!--  Ngày Thường -->
                    <td rowspan="4" class="cam">${listGT.getNgayLe()}</td> <!--  Ngày Lễ -->
                </tr>
                <tr>
                    <td>Trưa (12:00-16:00)</td>
                    <!-- for GroupLV  -->
                    <!-- if GroupTong.nv == GroupLV.nv -->
                    <!-- if  GroupLV.idLV.idGRCaLam.idCa == 2 -->
                    <c:forEach items="${listGroupLV}" var="listGRLV">
                        <!-- if GroupTong.nv == GroupLV.nv -->
                        <c:if test="${listGRLV.getIdNhanVien().getIdNhanVien() == listGT.getIdNhanVien().getIdNhanVien()}">
                            <!-- if  GroupLV.idLV.idGRCaLam.idCa == 1 -->
                            <c:if test="${listGRLV.getIdLamViec().getIdCaLam().getIdCa().getIdCa() ==2}">
                                <td>${listGRLV.getIdLamViec().getIdCaLam().getIdKH().getTenKH()}</td>
                            </c:if>
                        </c:if>
                    </c:forEach>
                    <!--                    <td>
                                    <ion-icon name="checkmark"></ion-icon>
                                </td>
                                <td></td>
                                <td></td>
                                <td class="vang">NL</td>-->


                </tr>
                <tr>
                    <td>Tối (17:00-22:00)</td>
                    <!-- for GroupLV  -->
                    <!-- if GroupTong.nv == GroupLV.nv -->
                    <!-- if  GroupLV.idLV.idGRCaLam.idCa == 2 -->

                    <c:forEach items="${listGroupLV}" var="listGRLV">
                        <!-- if GroupTong.nv == GroupLV.nv -->
                        <c:if test="${listGRLV.getIdNhanVien().getIdNhanVien() == listGT.getIdNhanVien().getIdNhanVien()}">
                            <!-- if  GroupLV.idLV.idGRCaLam.idCa == 1 -->
                            <c:if test="${listGRLV.getIdLamViec().getIdCaLam().getIdCa().getIdCa() ==3}">
                                <td>${listGRLV.getIdLamViec().getIdCaLam().getIdKH().getTenKH()}</td>
                            </c:if>
                        </c:if>
                    </c:forEach>


                </tr>
                <tr class="cam">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>Công</td>
                    <!-- for Bang Cong -->
                    <c:forEach items="${listBangCong}" var="liBC">
                        <c:if test="${liBC.idNhanVien.idNhanVien == listGT.idNhanVien.idNhanVien}">
                            <td>${liBC.socong}</td>
                        </c:if>
                    </c:forEach>


                    <!--  -->
                </tr>
                <!--  -->
            </c:forEach>
            <!-- End -->

        </table>


    </body>
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</html>

