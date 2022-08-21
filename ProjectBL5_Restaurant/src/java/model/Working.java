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
public class Working {

    private int wid;
    private Employees eid;
    private Date ci1;
    private Date ci2;
    private Date ci3;
    private Date co1;
    private Date co2;
    private Date co3;
    private int tc1;
    private int tc2;
    private float hour;
    private float total;
    private Date dayW;
    private String dob;

    public Working() {
    }

    public Working(int wid, Employees eid, Date ci1, Date ci2, Date ci3, Date co1, Date co2, Date co3, int tc1, int tc2, float hour, float total, Date dayW, String dob) {
        this.wid = wid;
        this.eid = eid;
        this.ci1 = ci1;
        this.ci2 = ci2;
        this.ci3 = ci3;
        this.co1 = co1;
        this.co2 = co2;
        this.co3 = co3;
        this.tc1 = tc1;
        this.tc2 = tc2;
        this.hour = hour;
        this.total = total;
        this.dayW = dayW;
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
   

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public Employees getEid() {
        return eid;
    }

    public void setEid(Employees eid) {
        this.eid = eid;
    }

    public Date getCi1() {
        return ci1;
    }

    public void setCi1(Date ci1) {
        this.ci1 = ci1;
    }

    public Date getCi2() {
        return ci2;
    }

    public void setCi2(Date ci2) {
        this.ci2 = ci2;
    }

    public Date getCi3() {
        return ci3;
    }

    public void setCi3(Date ci3) {
        this.ci3 = ci3;
    }

    public Date getCo1() {
        return co1;
    }

    public void setCo1(Date co1) {
        this.co1 = co1;
    }

    public Date getCo2() {
        return co2;
    }

    public void setCo2(Date co2) {
        this.co2 = co2;
    }

    public Date getCo3() {
        return co3;
    }

    public void setCo3(Date co3) {
        this.co3 = co3;
    }

    public int getTc1() {
        return tc1;
    }

    public void setTc1(int tc1) {
        this.tc1 = tc1;
    }

    public int getTc2() {
        return tc2;
    }

    public void setTc2(int tc2) {
        this.tc2 = tc2;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDayW() {
        return dayW;
    }

    public void setDayW(Date dayW) {
        this.dayW = dayW;
    }

}

   