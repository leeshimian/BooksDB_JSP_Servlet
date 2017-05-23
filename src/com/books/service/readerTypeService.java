package com.books.service;

import com.books.model.ReaderType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class readerTypeService {
    private Connection conn;
    private PreparedStatement pstmt;

    public readerTypeService() {
        conn = new com.books.conn.conn().getCon();
    }

    public boolean addReaderType(ReaderType readerType) {
        try {
            pstmt = conn.prepareStatement("insert into ReaderType"
                    + "(rdType,rdTypeName,canLendQty,canLendDay) "
                    + "values(?,?,?,?)");
            pstmt.setInt(1, readerType.getrdType());
            pstmt.setString(2, readerType.getrdTypeName());
            pstmt.setInt(3, readerType.getcanLendQty());
            pstmt.setInt(4, readerType.getcanLendDay());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
            return false;
        }

    }

    public List queryAllReaderType() {
        List readerTypes = new ArrayList();
        try {
            pstmt = conn.prepareStatement("select * from ReaderType");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ReaderType readerType = new ReaderType();
                readerType.setrdType(rs.getInt(1));
                readerType.setrdTypeName(rs.getString(2));
                readerType.setcanLendQty(rs.getInt(3));
                readerType.setcanLendDay(rs.getInt(4));

                readerTypes.add(readerType);

            }
            return readerTypes;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public ReaderType queryReaderTypebyrdType(int rdType) {
        try {
            pstmt = conn.prepareStatement("select * from ReaderType where rdType=?");
            pstmt.setInt(1, rdType);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                ReaderType readerType = new ReaderType();
                readerType.setrdType(rs.getInt(1));
                readerType.setrdTypeName(rs.getString(2));
                readerType.setcanLendQty(rs.getInt(3));
                readerType.setcanLendDay(rs.getInt(4));
                return readerType;
            }
            return null;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public boolean updateReaderType(ReaderType readerType) {

        try {
            pstmt = conn.prepareStatement("update  ReaderType set rdTypeName=? , canLendQty=? , canLendDay=?  where rdType=?");

            pstmt.setString(1, readerType.getrdTypeName());
            pstmt.setInt(2, readerType.getcanLendQty());
            pstmt.setInt(3, readerType.getcanLendDay());
            pstmt.setInt(4,readerType.getrdType());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Boolean deleteReaderType(int rdType) {
        try {
            pstmt = conn.prepareStatement("delete from  ReaderType where rdType=?");
            pstmt.setInt(1, rdType);

            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }

    }
}


