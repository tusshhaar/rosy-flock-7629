package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.BiddingPriceSet;
import com.masai.dao.BiddingDao;
import com.masai.dao.BiddingDaoImpl;
import com.masai.dao.BuyerLoginDaoImpl;

public class BiddingPrice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item ID");
		int iId = sc.nextInt();
		
		System.out.println("Enter Price");
		int iPrice = sc.nextInt();
		
		int bId = BuyerLoginDaoImpl.buyerID;
		
		BiddingDao dao = new BiddingDaoImpl();
		
		BiddingPriceSet bid = new BiddingPriceSet(iId, iPrice, bId);
		
		String str = dao.setPriceForBidding(bid);
		
		if(str!=null) {
			System.out.println(str);
		}else {
			System.out.println("Error...");
		}

	}
}
