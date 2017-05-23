package com.books.service;

import com.books.model.Reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class readerService {
    private Connection conn;
    private PreparedStatement pstmt;

    public readerService() {
        conn = new com.books.conn.conn().getCon();
    }

    public boolean addReader(Reader reader) {
        try {
            pstmt = conn.prepareStatement("insert into Reader"
                    + "(rdID,rdType,rdName,rdDept,rdQQ,rdBorrowQty) "
                    + "values(?,?,?,?,?,?)");
            pstmt.setString(1, reader.getrdID());
            pstmt.setInt(2, reader.getrdType());
            pstmt.setString(3, reader.getrdName());
            pstmt.setString(4, reader.getrdDept());
            pstmt.setString(5, reader.getrdQQ());
            pstmt.setInt(6, reader.getrdBorrowQty());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
            return false;
        }

    }

    public List queryAllReader() {
        List readers = new ArrayList();
        try {
            pstmt = conn.prepareStatement("select * from Reader");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Reader reader = new Reader();
                reader.setrdID(rs.getString(1));
                reader.setrdType(rs.getInt(2));
                reader.setrdName(rs.getString(3));
                reader.setrdDept(rs.getString(4));
                reader.setrdQQ(rs.getString(5));
                reader.setrdBorrowQty(rs.getInt(6));

                readers.add(reader);

            }
            return readers;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public Reader queryReaderbyrdID(String rdID) {
        try {
            pstmt = conn.prepareStatement("select * from Reader where rdID=?");
            pstmt.setString(1, rdID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Reader reader = new Reader();
                reader.setrdID(rs.getString(1));
                reader.setrdType(rs.getInt(2));
                reader.setrdName(rs.getString(3));
                reader.setrdDept(rs.getString(4));
                reader.setrdQQ(rs.getString(5));
                reader.setrdBorrowQty(rs.getInt(6));
                return reader;
            }
            return null;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public boolean updateReader(Reader reader) {

        try {
            pstmt = conn
                    .prepareStatement("update  Reader set rdType=?, rdName=? , rdDept=? , rdQQ=? ,"
                            + "rdBorrowQty=? where rdID=?");
            pstmt.setInt(1, reader.getrdType());
            pstmt.setString(2, reader.getrdName());
            pstmt.setString(3, reader.getrdDept());
            pstmt.setString(4, reader.getrdQQ());
            pstmt.setInt(5, reader.getrdBorrowQty());
            pstmt.setString(6, reader.getrdID());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Boolean deleteReader(String rdID) {
        try {
            pstmt = conn.prepareStatement("delete from  Reader where rdID=?");
            pstmt.setString(1, rdID);

            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }

    }
}


