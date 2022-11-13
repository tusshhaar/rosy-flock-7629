package com.masai.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.masai.bean.BuyerPurchasedData;
import com.masai.connection.DatabaseConnection;
import com.masai.dao.BiddingDao;
import com.masai.dao.BiddingDaoImpl;

public class ViewMaxBiddingPriceById {
	
	public static void updateList(int iId, List<BuyerPurchasedData> list) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean val = true;
		
		while(val) {
			
			Seperator.seperate();
			
			System.out.println("Enter 1 For Sold");
			System.out.println("Enter 2 For Exit");
			System.out.println("Enter 3 For Home Page");
			
			val = false;
			
			Seperator.seperate();
			
			int num = sc.nextInt();
			
			if(num==1) {
				
				try (Connection conn = DatabaseConnection.dbConnection()) {
					
					PreparedStatement ps = conn.prepareStatement("update sellItem set iSoldUnsold = 'Sold' where iId = "+iId);
					
					int x = ps.executeUpdate();
					
					if(x > 0) {
						
						list.forEach(s -> System.out.println("Item Id "+s.getItemId()+" Sold To "+s.getBuyerName()+" Acc To Maximum Price Which is "+s.getLastPrice()));
						
					}
					
					val = true;
					
				} catch (SQLException e) {
					
					System.out.println("No Data Found!");
					// TODO: handle exception
				}
			}else if (num == 2) {
				
				ExitFromPage.main(null);
				
				break;
			}
			else if (num == 3) {
				
				SellerBuyer.main(null);
				
				break;
			}
			else {
				System.out.println("Enter Right Number");
				
				val = true;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item ID To See Which Buyer Has Maximum Bidding Price");
		int iId = scan.nextInt();
		
		Seperator.seperate();
		
		BiddingDao dao = new BiddingDaoImpl();
		
		List<BuyerPurchasedData> list = dao.buyerPurchase(iId);
		
		if(list.size()!=0) {
			list.forEach(s -> System.out.println(s));
		}else {
			System.out.println("No Data Found");
		}
		
		updateList(iId, list);
	}
}
