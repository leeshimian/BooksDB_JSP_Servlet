package com.books.service;

import com.books.model.Borrow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class borrowService {
    private Connection conn;
    private PreparedStatement pstmt;

    public borrowService(){
        conn = new com.books.conn.conn().getCon();
    }

    public List queryAllBorrow(){
        List borrows = new ArrayList();
        try {
            pstmt = conn.prepareStatement("SELECT * FROM Borrow");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                Borrow borrow = new Borrow();
                borrow.setRdID(rs.getString(1));
                borrow.setBkID(rs.getString(2));
                borrow.setDateBorrow(rs.getDate(3));
                borrow.setDateLendPlan(rs.getDate(4));
                borrow.setDateLendAct(rs.getDate(5));

                borrows.add(borrow);
            }
            return borrows;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
