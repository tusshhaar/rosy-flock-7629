package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Bidding;
import com.masai.dao.BiddingDao;
import com.masai.dao.BiddingDaoImpl;
import com.masai.dao.BuyerLoginDaoImpl;

public class AddBiddingData {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter Item ID");
		int iId = sc.nextInt();

		int bId = BuyerLoginDaoImpl.buyerID;
		
		Seperator.seperate();
		
		Bidding bid = new  Bidding(iId, bId);
		
		BiddingDao dao = new BiddingDaoImpl();
		
		String str = dao.insertData(bid);
		
		if(str!=null) {
			System.out.println(str);
		}else {
			System.out.println("Something Went Wrong");
		}
	}
}
