package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.BiddingDao;
import com.masai.dao.BiddingDaoImpl;

public class DeleteItemFromBidding {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Seperator.seperate();
		
		System.out.println("Enter Item ID");
		int iId = sc.nextInt();
		
		Seperator.seperate();
		
		BiddingDao dao = new BiddingDaoImpl();
		
		String msg = dao.deleteItemFromBidding(iId);
		
		if(msg!=null) {
			System.out.println(msg);
		}else {
			System.out.println("No Data Found!");
		}
		
	}
}
