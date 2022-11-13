package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.connection.DatabaseConnection;
import com.masai.exception.BuyerException;

public class BuyerDaoImpl implements BuyerDao {

	@Override
	public String AddBuyer(Buyer buyer) throws BuyerException {
		
		String msg = "Not Added";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into buyer values(?,?,?,?,?)");
			
			ps.setInt(1, buyer.getbId());
			ps.setString(2, buyer.getbName());
			ps.setString(3, buyer.getbEmail());
			ps.setString(4, buyer.getbPassword());
			ps.setString(5, buyer.getbMob());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Added Successfully...";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return msg;
	}

	@Override
	public List<Buyer> viewBuyerList() {
		
		List<Buyer> list = new ArrayList<>();
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from buyer");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Buyer buyer = new Buyer();
				
				buyer.setbId(rs.getInt("bId"));
				buyer.setbName(rs.getString("bName"));
				buyer.setbEmail(rs.getString("bEmail"));
				buyer.setbPassword(rs.getString("bPassword"));
				buyer.setbMob(rs.getString("bMob"));
				
				list.add(buyer);
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		if(list.size()==0) {
			System.out.println("No Data Found!");
		}
		
		return list;
	}

}
