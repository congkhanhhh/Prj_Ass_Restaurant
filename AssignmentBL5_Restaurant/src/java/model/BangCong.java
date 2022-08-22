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
public class BangCong {
    private int idcong;
    private NhanVien idNhanVien;
    private int socong;
    private Date ngayc;

    public BangCong() {
    }

    public BangCong(int idcong, NhanVien idNhanVien, int socong, Date ngayc) {
        this.idcong = idcong;
        this.idNhanVien = idNhanVien;
        this.socong = socong;
        this.ngayc = ngayc;
    }

    public int getIdcong() {
        return idcong;
    }

    public void setIdcong(int idcong) {
        this.idcong = idcong;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getSocong() {
        return socong;
    }

    public void setSocong(int socong) {
        this.socong = socong;
    }

    public Date getNgayc() {
        return ngayc;
    }

    public void setNgayc(Date ngayc) {
        this.ngayc = ngayc;
    }

    @Override
    public String toString() {
        return "BangCong{" + "idcong=" + idcong + ", idNhanVien=" + idNhanVien.toString() + ", socong=" + socong + ", ngayc=" + ngayc + '}';
    }
    
}
