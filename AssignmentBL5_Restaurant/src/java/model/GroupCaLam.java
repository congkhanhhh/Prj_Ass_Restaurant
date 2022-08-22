/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class GroupCaLam {
    private int id;
    private KyHieuChamCong idKH;
    private Ca idCa;

    public GroupCaLam() {
    }

    public GroupCaLam(int id, KyHieuChamCong idKH, Ca idCa) {
        this.id = id;
        this.idKH = idKH;
        this.idCa = idCa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public KyHieuChamCong getIdKH() {
        return idKH;
    }

    public void setIdKH(KyHieuChamCong idKH) {
        this.idKH = idKH;
    }

    public Ca getIdCa() {
        return idCa;
    }

    public void setIdCa(Ca idCa) {
        this.idCa = idCa;
    }

    @Override
    public String toString() {
        return "GroupCaLam{" + "id=" + id + ", idKH=" + idKH.toString() + ", idCa=" + idCa.toString() + '}';
    }
    
}
