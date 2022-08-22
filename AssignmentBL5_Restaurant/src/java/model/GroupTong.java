/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class GroupTong {
    private int id;
    private NhanVien idNhanVien;
    private int TongCong;
    private int NghiPhep;
    private int NghiLe;
    private int NghiKhongLuong;
    private int NgayThuong;
    private int NgayLe;

    public GroupTong() {
    }

    public GroupTong(int id, NhanVien idNhanVien, int TongCong, int NghiPhep, int NghiLe, int NghiKhongLuong, int NgayThuong, int NgayLe) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.TongCong = TongCong;
        this.NghiPhep = NghiPhep;
        this.NghiLe = NghiLe;
        this.NghiKhongLuong = NghiKhongLuong;
        this.NgayThuong = NgayThuong;
        this.NgayLe = NgayLe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getTongCong() {
        return TongCong;
    }

    public void setTongCong(int TongCong) {
        this.TongCong = TongCong;
    }

    public int getNghiPhep() {
        return NghiPhep;
    }

    public void setNghiPhep(int NghiPhep) {
        this.NghiPhep = NghiPhep;
    }

    public int getNghiLe() {
        return NghiLe;
    }

    public void setNghiLe(int NghiLe) {
        this.NghiLe = NghiLe;
    }

    public int getNghiKhongLuong() {
        return NghiKhongLuong;
    }

    public void setNghiKhongLuong(int NghiKhongLuong) {
        this.NghiKhongLuong = NghiKhongLuong;
    }

    public int getNgayThuong() {
        return NgayThuong;
    }

    public void setNgayThuong(int NgayThuong) {
        this.NgayThuong = NgayThuong;
    }

    public int getNgayLe() {
        return NgayLe;
    }

    public void setNgayLe(int NgayLe) {
        this.NgayLe = NgayLe;
    }

    
    @Override
    public String toString() {
        return "GroupTong{" + "id=" + id + ", idNhanVien=" + idNhanVien + ", TongCong=" + TongCong + ", NghiPhep=" + NghiPhep + ", NghiKhongLuong=" + NghiKhongLuong + ", NgayThuong=" + NgayThuong + ", NgayLe=" + NgayLe + '}';
    }
    
    
}
