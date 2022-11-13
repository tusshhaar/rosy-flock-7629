package com.masai.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection dbConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/auction";
		
		try {
			
			conn = DriverManager.getConnection(url, "root", "root");
			
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		return conn;
	}
}
