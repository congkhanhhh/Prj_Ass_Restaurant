/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class LamViec {
    private int id;
    private GroupCaLam idCaLam;
    private int cong;

    public LamViec() {
    }

    public LamViec(int id, GroupCaLam idCaLam, int cong) {
        this.id = id;
        this.idCaLam = idCaLam;
        this.cong = cong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupCaLam getIdCaLam() {
        return idCaLam;
    }

    public void setIdCaLam(GroupCaLam idCaLam) {
        this.idCaLam = idCaLam;
    }

    public int getCong() {
        return cong;
    }

    public void setCong(int cong) {
        this.cong = cong;
    }

    @Override
    public String toString() {
        return "LamViec{" + "id=" + id + ", idCaLam=" + idCaLam.toString() + ", cong=" + cong + '}';
    }
    
    
}
