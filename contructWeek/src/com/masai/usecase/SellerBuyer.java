package com.masai.usecase;

import java.util.Scanner;

public class SellerBuyer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To The Automatic Auction System");
		
		Seperator.seperate();
		
		boolean val = true;
		
		while(val) {
			System.out.println("Enter 1 For Admin/Seller Login");
			System.out.println("Enter 2 For Buyer Login");
			System.out.println("Enter 3 For Register As A Admin or Seller");
			System.out.println("Enter 4 For Register As A Buyer");
			System.out.println("Enter 5 To View The Item List");
			
			Seperator.seperate();
			
			int num = sc.nextInt();
			
			Seperator.seperate();
			
			switch(num) {
			case 1: LoginAsASeller.main(null);
			        break;
			case 2: BuyerLogin.main(null);
				    break;
			case 3: RegisterSellerData.main(null);
			        break;
			case 4: RegisterBuyerData.main(null);
				    break;
			case 5: ViewItemList.main(null);
			        break;
			}
			
			val = false;
			
			Seperator.seperate();
			
			System.out.println("Enter 1 For Go Back");
			int num1 = sc.nextInt();
			
			Seperator.seperate();
			
			switch(num1) {
			case 1 : val = true;
			break;
			}
		}

	}
}
