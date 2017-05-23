package com.books.service;

import com.books.model.userTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userService {
	private Connection conn;
	private PreparedStatement pstmt;
	public userService() {
		conn = new com.books.conn.conn().getCon();
	}

	public boolean valiUser(userTable user)
	{
		
		try {
			pstmt=conn.prepareStatement("select * from usertable where username=? and password=?");
			pstmt.setString(1,user.getUsername());
			pstmt.setString(2,user.getPassword());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				return true;
			else
				return false;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
}
