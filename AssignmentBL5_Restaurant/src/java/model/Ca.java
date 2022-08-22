/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Ca {
    private int idCa;
    private String tenCa;

    public Ca() {
    }

    public Ca(int idCa, String tenCa) {
        this.idCa = idCa;
        this.tenCa = tenCa;
    }

    public int getIdCa() {
        return idCa;
    }

    public void setIdCa(int idCa) {
        this.idCa = idCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    @Override
    public String toString() {
        return "Ca{" + "idCa=" + idCa + ", tenCa=" + tenCa + '}';
    }
    
    
}
