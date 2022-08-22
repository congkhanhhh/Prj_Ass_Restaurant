/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien {
    private int idNhanVien;
    private String tenNhanVien;
    private PhongBan idPhongBan;

    public NhanVien() {
    }

    public NhanVien(int idNhanVien, String tenNhanVien, PhongBan idPhongBan) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.idPhongBan = idPhongBan;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public PhongBan getIdPhongBan() {
        return idPhongBan;
    }

    public void setIdPhongBan(PhongBan idPhongBan) {
        this.idPhongBan = idPhongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "idNhanVien=" + idNhanVien + ", tenNhanVien=" + tenNhanVien + ", idPhongBan=" + idPhongBan + '}';
    }
    
    
}
