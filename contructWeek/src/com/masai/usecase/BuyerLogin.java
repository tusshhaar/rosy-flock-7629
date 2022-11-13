package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.BuyerLoginDao;
import com.masai.dao.BuyerLoginDaoImpl;

public class BuyerLogin {
	
	public static void switchCase() {
		
		Scanner sc = new Scanner(System.in);
		
		boolean val = true;
		
		while(val) {
			
			System.out.println("Enter 1 To Add Item In Your List");
			System.out.println("Enter 2 To Set Price");
			System.out.println("Enter 3 To See Your List");
			System.out.println("Enter 4 To Delete Item From Your List");

			Seperator.seperate();
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1: AddBiddingData.main(null);
			break;
			
			case 2: BiddingPrice.main(null);
			break;
			
			case 3: ViewBiddingPriceListOfBuyers.main(null);
			break;
			
			case 4: DeleteItemFromBidding.main(null);
			break;
			}
			
			val = false;
			
			Seperator.seperate();
			
			System.out.println("Enter 1 For Home Page");
			System.out.println("Enter 2 For Go Back");
			System.out.println("Enter 3 For LogOut");
			System.out.println("Enter 4 For Exit");
			
			Seperator.seperate();
			
			int num2 = sc.nextInt();
			
			switch(num2) {
			case 1: SellerBuyer.main(null);
			break;
			
			case 2: val = true;
			break;
			
			case 3: BuyerLogin.main(null);
			break;
			
			case 4 : ExitFromPage.main(null);
			break;
			}
		}

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Buyer Username or Email");
		String bEmail = sc.next();
		
		System.out.println("Enter Buyer Password");
		String bPassword = sc.next();
		
		Seperator.seperate();
		
		BuyerLoginDao dao = new BuyerLoginDaoImpl();
		
		String name = dao.loginAsABuyer(bEmail, bPassword);
		
		if(name!=null) {
			System.out.println("Welcome "+name+" To The Auction Board");
			
			Seperator.seperate();

			BuyerLogin.switchCase();
			
		}else {
			System.out.println("Invalid username or password");
		}
	}
}
