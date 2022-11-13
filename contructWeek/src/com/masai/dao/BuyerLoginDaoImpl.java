package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.connection.DatabaseConnection;

public class BuyerLoginDaoImpl implements BuyerLoginDao {
	
	public static int buyerID;

	@Override
	public String loginAsABuyer(String bEmail, String bPassword) {
		
		String name = null;
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select bName, bId from buyer where bEmail = ? AND bPassword = ?");
			
			ps.setString(1, bEmail);
			ps.setString(2, bPassword);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				name = rs.getString("bName");
				buyerID = rs.getInt("bId");
				
			}			
			
		} catch (SQLException e) {
			
			name = e.getMessage();
			
		}
		
		return name;
	}

}
