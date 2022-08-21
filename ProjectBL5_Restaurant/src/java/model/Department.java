/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Department {
    private int did;
    private String dname;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public int getDid() {
        return did;
    }

    public String getDname() {
        return dname;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
    
}
