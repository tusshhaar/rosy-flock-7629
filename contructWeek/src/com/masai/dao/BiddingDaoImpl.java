package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Bidding;
import com.masai.bean.BiddingPriceSet;
import com.masai.bean.BuyerPurchasedData;
import com.masai.connection.DatabaseConnection;

public class BiddingDaoImpl implements BiddingDao {

	@Override
	public String insertData(Bidding bid) {
		
		String msg = "Not Inserted..";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into bidding(iId, bId) values(?,?)");
			
			ps.setInt(1, bid.getiId());
			ps.setInt(2, bid.getbId());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
			     msg = "Inserted Successfully";
			}
			
		} catch (SQLException e) {
			msg = e.getMessage();
			// TODO: handle exception
		}
		
		
		return msg;
	}

	@Override
	public String setPriceForBidding(BiddingPriceSet bid) {
		
		String msg = "Something Went Wrong!";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into biddingPrice values(?,?,?)");
			
			ps.setInt(1, bid.getiId());
			ps.setInt(2, bid.getiPrice());
			ps.setInt(3, bid.getbId());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				
				msg = "Added Successfully";
			}
			
		} catch (SQLException e) {
			
			msg = e.getMessage();
			// TODO: handle exception
		}
		
		
		return msg;
	}

	@Override
	public List<BiddingPriceSet> ViewBiddingList() {
		
		List<BiddingPriceSet> list = new ArrayList<>();
		
		int ID = BuyerLoginDaoImpl.buyerID;
		
//		System.out.println(ID);
		
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
		      PreparedStatement ps = conn.prepareStatement("select * from biddingPrice where bId ="+ID);
		      
		      ResultSet rs = ps.executeQuery();
		      
		      while(rs.next()) {
		    	  
		    	  int iId = rs.getInt("iId");
		    	  int iPrice = rs.getInt("iPrice");
		    	  int bId = rs.getInt("bId");
		    	  
		    	  BiddingPriceSet bid = new BiddingPriceSet(iId, iPrice, bId);
		    	  
		    	  list.add(bid);
		      }
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		
		if(list.size()==0) {
			System.out.println("No Data Found!");
		}
		
		
		
		return list;
	}

	@Override
	public List<BuyerPurchasedData> buyerPurchase(int iId) {
		
		List<BuyerPurchasedData> list = new ArrayList<>();
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select bd.bId, b.bName, i.iName, bd.iId, i.iPrice as price, bd.iPrice from biddingPrice bd "
					                                      + "INNER JOIN buyer b INNER JOIN sellItem i "
					                                      + "ON bd.bId = b.bId AND bd.iId = i.iId "
					                                      + "where bd.iPrice = (select max(iPrice) from biddingPrice where iId = ?)"
					                                      + " group by bd.bId;");
			
			ps.setInt(1, iId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				BuyerPurchasedData data = new BuyerPurchasedData();
				data.setBuyerId(rs.getInt("bId"));
				data.setBuyerName(rs.getString("bName"));
				data.setItemName(rs.getString("iName"));
			    data.setItemId(rs.getInt("iId"));
				data.setOriginalPrice(rs.getInt("price"));
				data.setLastPrice(rs.getInt("iPrice"));
				
				list.add(data);
				
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		if(list.size()==0) {
			System.out.println("No Data Found");
		}
		
		return list;
	}

	@Override
	public String deleteItemFromBidding(int iId) {
		
		int ID = BuyerLoginDaoImpl.buyerID;
		
		String str = "No Data Found!";
		
		try (Connection conn = DatabaseConnection.dbConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete biddingPrice from biddingPrice where iId = ? AND bId = "+ID);
			
			ps.setInt(1, iId);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				
				str = "Deleted Successfully";
				
				PreparedStatement ps1 = conn.prepareStatement("delete bidding from bidding where iId = ? AND bId ="+ID);
				
				ps1.setInt(1, iId);
				
				int y = ps1.executeUpdate();
			}
			
		} catch (SQLException e) {
			
			str = e.getMessage();
		}

		
		return str;
	}

}
