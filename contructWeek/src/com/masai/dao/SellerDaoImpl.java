package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Seller;
import com.masai.connection.DatabaseConnection;
import com.masai.exception.SellerException;

public class SellerDaoImpl implements SellerDao {

	@Override
	public String registeredSeller(Seller seller) throws SellerException {
		
		String msg = "Not Registered..";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into seller values(?,?,?,?,?,?)");
			
			ps.setInt(1, seller.getsId());
			ps.setString(2, seller.getsName());
			ps.setString(3, seller.getsAddress());
			ps.setString(4, seller.getsEmail());
			ps.setString(5, seller.geteMob());
			ps.setString(6, seller.getePassword());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Seller Registered Successfully..";
			}
			
		} catch (SQLException e) {
			msg = e.getMessage();
			throw new SellerException(e.getMessage());
			// TODO: handle exception
		}
		
		
		return msg;
	}

	@Override
	public String updateSellerPassword(String sPassowrd, int sId) throws SellerException {
		
		String msg = "Not Updated..";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update seller set sPassword = ? where sId = ?");
			
			ps.setString(1, sPassowrd);
			ps.setInt(2, sId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Updated Successfully";
			}
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
			throw new SellerException(e.getMessage());
			// TODO: handle exception
		}

		
		return msg;
	}

	@Override
	public String updateSellerUsername(String sEmail, int sId) throws SellerException {
		
		String msg = "Not Updated..";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update seller set sEmail = ? where sId = ?");
			
			ps.setString(1, sEmail);
			ps.setInt(2, sId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Updated Successfully";
			}
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
			throw new SellerException(e.getMessage());
			// TODO: handle exception
		}

		
		return msg;
	}
	
}
