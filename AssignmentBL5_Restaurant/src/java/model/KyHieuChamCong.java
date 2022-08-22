/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class KyHieuChamCong {

    private int idKH;
    private String tenKH;

    public KyHieuChamCong(int idKH, String tenKH) {
        this.idKH = idKH;
        this.tenKH = tenKH;
    }

    public KyHieuChamCong() {
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "KyHieuChamCong{" + "idKH=" + idKH + ", tenKH=" + tenKH + '}';
    }
}
