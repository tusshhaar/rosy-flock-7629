package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Item;
import com.masai.connection.DatabaseConnection;

public class ItemDaoImpl implements ItemDao {

	@Override
	public String addItem(Item item) {
		
		String msg = "Not Added";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into sellItem values(?,?,?,?,?,?)");
			
			ps.setInt(1, item.getiId());
			ps.setString(2, item.getiName());
			ps.setInt(3, item.getiPrice());
			ps.setInt(4, item.getiQuantity());
			ps.setString(5, item.getiSoldUnsold());
			ps.setString(6, item.getCategory());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Item Added Successfully...";
			}
			
		} catch (SQLException e) {
			msg = e.getMessage();
			// TODO: handle exception
		}
		
		
		return msg;
	}

	@Override
	public String updatePrice(int iPrice, int iId) {
		
		String msg = "Not Updated";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update sellItem set iPrice = ? where iId = ?");
			
			ps.setInt(1, iPrice);
			ps.setInt(2, iId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Updated Successfully...";
			}
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
			
		}
		
		
		return msg;
	}

	@Override
	public String updateQuantity(int iQuantity, int iId) {
		
		String msg = "Not Updated";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update sellItem set iQuantity = ? where iId = ?");
			
			ps.setInt(1, iQuantity);
			ps.setInt(2, iId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Updated Successfully...";
			}
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
			
		}
		
		
		return msg;
	}

	@Override
	public List<Item> viewItemList() {
		
		List<Item> list = new ArrayList<>();
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from sellItem");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("iId");
				String iName = rs.getString("iName");
				int price = rs.getInt("iPrice");
				int quantity = rs.getInt("iQuantity");
				String soldUnsold = rs.getString("iSoldUnsold");
				String iCategory = rs.getString("iCategory");
				
				Item item = new Item(id, iName, price, quantity, soldUnsold, iCategory);
				
				list.add(item);
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		if(list.size()==0) {
			System.out.println("No List Of Item...");
		}
		
		
		return list;
	}

	@Override
	public String deleteItemById(int iId) {
		
		String msg = "Not Deleted...";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete sellItem from sellItem where iId = ?");
			
			ps.setInt(1, iId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				msg = "Successfully Deleted...";
			}
			
		} catch (SQLException e) {
			System.out.println("Already Selected By The Buyer");
			msg = e.getMessage();
			// TODO: handle exception
		}
		
		
		
		
		
		return msg;
	}


		

	}


