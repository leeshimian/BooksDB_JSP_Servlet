package com.books.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class returnBookService {
    private Connection conn;

    public returnBookService(){
        conn = new com.books.conn.conn().getCon();
    }

    public boolean ReturnBook(String rdID, String bkID){
        try{
            //创建存储过程对象
            CallableStatement cs = conn.prepareCall("{call usp_ReturnBook(?, ?)}");
            //给存储过程设置参数
            cs.setString(1,bkID);
            cs.setString(2,rdID);
            cs.execute();  //执行存储过程
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            try{
                if (!conn.isClosed()){
                    conn.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
