/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class GroupLV {
    private int id;
    private NhanVien idNhanVien;
    private LamViec idLamViec;
    private Date ngay;

    public GroupLV() {
    }

    public GroupLV(int id, NhanVien idNhanVien, LamViec idLamViec, Date ngay) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idLamViec = idLamViec;
        this.ngay = ngay;
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

    public LamViec getIdLamViec() {
        return idLamViec;
    }

    public void setIdLamViec(LamViec idLamViec) {
        this.idLamViec = idLamViec;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return "GroupLV{" + "id=" + id + ", idNhanVien=" + idNhanVien.toString() + ", idLamViec=" + idLamViec.toString() + ", ngay=" + ngay + '}';
    }
    
    
}
