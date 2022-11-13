package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Buyer;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exception.BuyerException;

public class RegisterBuyerData {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer ID");
		int bId = sc.nextInt();
		
		System.out.println("Enter Buyer Name");
		String bName = sc.next();
		
		System.out.println("Enter Buyer Email");
		String bEmail = sc.next();
		
		System.out.println("Enter Buyer Password");
		String bPassword = sc.next();
		
		System.out.println("Enter Buyer Mobile Number");
		String bMob = sc.next();
		
		Buyer buyer = new Buyer(bId, bName, bEmail, bPassword, bMob);
		
		BuyerDao dao = new BuyerDaoImpl();
		
		try {
			
			String msg = dao.AddBuyer(buyer);
			System.out.println(msg);
			
		} catch (BuyerException e) {
			
			System.out.println(e.getMessage());
		}
		

	}
}
