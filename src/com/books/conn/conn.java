package com.books.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class conn {

	public Connection getCon() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost;databaseName=BooksDB";
			String user = "sa";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn.getMetaData().getURL());

			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
