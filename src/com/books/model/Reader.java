package com.books.model;

public class Reader {

    private String rdID;
    private int rdType;
    private String rdName;
    private String rdDept;
    private String rdQQ;
    private int rdBorrowQty;

    //构造函数
    public String getrdID() {
        return rdID;
    }

    public void setrdID(String rdID) {
        this.rdID = rdID;
    }

    public int getrdType() {
        return rdType;
    }

    public void setrdType(int rdType) {
        this.rdType = rdType;
    }

    public String getrdName() {
        return rdName;
    }

    public void setrdName(String rdName) {
        this.rdName = rdName;
    }

    public String getrdDept() {
        return rdDept;
    }

    public void setrdDept(String rdDept) {
        this.rdDept = rdDept;
    }

    public String getrdQQ() {
        return rdQQ;
    }

    public void setrdQQ(String rdQQ) {
        this.rdQQ = rdQQ;
    }

    public int getrdBorrowQty() {
        return rdBorrowQty;
    }

    public void setrdBorrowQty(int rdBorrowQty) {
        this.rdBorrowQty = rdBorrowQty;
    }

}
