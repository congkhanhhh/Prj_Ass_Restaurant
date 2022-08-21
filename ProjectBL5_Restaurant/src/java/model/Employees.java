/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Employees {
    private int id;
    private String ename;
    private Department did;

    public Employees() {
    }

    public Employees(int id, String ename, Department did) {
        this.id = id;
        this.ename = ename;
        this.did = did;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public Department getDid() {
        return did;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setDid(Department did) {
        this.did = did;
    }
    

}
