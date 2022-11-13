package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Seller;
import com.masai.connection.DatabaseConnection;

public class SellerLoginDaoImpl implements SellerLoginDao {

	@Override
	public Seller loginSeller(String username, String password){
		
		Seller seller = null;
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from seller where sEmail = ? AND sPassword = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int sId = rs.getInt("sId");
				String sName = rs.getString("sName");
				String sAddress = rs.getString("sAddress");
				String sEmail = rs.getString("sEmail");
				String eMob = rs.getString("eMob");
				String sPassword = rs.getString("sPassword");
				
				seller = new Seller(sId, sName, sAddress, sEmail, eMob, sPassword);
				
			}else {
				
				System.out.println("Inavild Username or Password");
			}
			
		} catch (SQLException e) {
			
			System.out.println("Invalid Username or Password");
		
		}
		
		return seller;
	}
	
}
