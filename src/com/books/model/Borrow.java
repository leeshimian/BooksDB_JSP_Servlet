package com.books.model;

import java.util.Date;

public class Borrow {
    private String rdID;
    private String bkID;
    private Date DateBorrow;
    private Date DateLendPlan;
    private Date DateLendAct;

    //构造函数
    public String getRdID() {
        return rdID;
    }

    public void setRdID(String rdID) {
        this.rdID = rdID;
    }

    public String getBkID() {
        return bkID;
    }

    public void setBkID(String bkID) {
        this.bkID = bkID;
    }

    public Date getDateBorrow() {
        return DateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        DateBorrow = dateBorrow;
    }

    public Date getDateLendPlan() {
        return DateLendPlan;
    }

    public void setDateLendPlan(Date dateLendPlan) {
        DateLendPlan = dateLendPlan;
    }

    public Date getDateLendAct() {
        return DateLendAct;
    }

    public void setDateLendAct(Date dateLendAct) {
        DateLendAct = dateLendAct;
    }
}
