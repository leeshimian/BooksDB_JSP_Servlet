package com.books.service;

import com.books.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookService {
    private Connection conn;
    private PreparedStatement pstmt;

    //重写，连接数据库
    public bookService() {
        conn = new com.books.conn.conn().getCon();
    }

    //添加图书
    public boolean addBook(Book book) {
        try {
            pstmt = conn.prepareStatement("insert into Book"
                    + "(bkID,bkName,bkAuthor,bkPress,bkPrice,bkState) "
                    + "values(?,?,?,?,?,?)");
            pstmt.setString(1, book.getbkID());
            pstmt.setString(2, book.getbkName());
            pstmt.setString(3, book.getbkAuthor());
            pstmt.setString(4, book.getbkPress());
            pstmt.setDouble(5, book.getbkPrice());
            pstmt.setInt(6, book.getbkState());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }

    //查询所有图书
    public List queryAllBook() {
        //创建图书集合对象
        List books = new ArrayList();
        try {
            pstmt = conn.prepareStatement("select * from Book");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setbkID(rs.getString(1));
                book.setbkName(rs.getString(2));
                book.setbkAuthor(rs.getString(3));
                book.setbkPress(rs.getString(4));
                book.setbkPrice(rs.getDouble(5));
                book.setbkState(rs.getInt(6));

                books.add(book);//将查询到的book信息放入集合

            }
            return books;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    //通过bkID查询
    public Book queryBookbybkID(String bkID) {
        try {
            pstmt = conn.prepareStatement("select * from Book where bkID=?");
            pstmt.setString(1, bkID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Book book = new Book();
                book.setbkID(rs.getString(1));
                book.setbkName(rs.getString(2));
                book.setbkAuthor(rs.getString(3));
                book.setbkPress(rs.getString(4));
                book.setbkPrice(rs.getDouble(5));
                book.setbkState(rs.getInt(6));
                return book;

            }
            return null;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    public boolean updateBook(Book book) {

        try {
            pstmt = conn
                    .prepareStatement("update  Book set bkName=? , bkAuthor=? , bkPress=? ,bkPrice=? ,"
                            + " bkState=?   where bkID=?");
            pstmt.setString(1, book.getbkName());
            pstmt.setString(2, book.getbkAuthor());
            pstmt.setString(3, book.getbkPress());
            pstmt.setDouble(4, book.getbkPrice());
            pstmt.setInt(5, book.getbkState());
            pstmt.setString(6, book.getbkID());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Boolean deleteBook(String bkID) {
        try {
            pstmt = conn.prepareStatement("delete from  Book where bkID=?");
            pstmt.setString(1, bkID);

            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }

    }
}

