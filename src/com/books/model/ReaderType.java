package com.books.model;

/**
 * Created by datei on 2017/5/18 0018.
 */
public class ReaderType {
    private int rdType;
    private String rdTypeName;
    private int canLendQty;
    private int canlendDay;

    //构造函数
    public int getrdType() {
        return rdType;
    }

    public void setrdType(int rdType) {
        this.rdType = rdType;
    }

    public String getrdTypeName() {
        return rdTypeName;
    }

    public void setrdTypeName(String rdTypeName) {
        this.rdTypeName = rdTypeName;
    }

    public int getcanLendQty() {
        return canLendQty;
    }

    public void setcanLendQty(int canLendQty) {
        this.canLendQty = canLendQty;
    }

    public int getcanLendDay() {
        return canlendDay;
    }

    public void setcanLendDay(int canlendDay) {
        this.canlendDay = canlendDay;
    }
}
