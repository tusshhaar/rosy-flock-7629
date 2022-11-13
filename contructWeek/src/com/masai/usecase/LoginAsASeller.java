package com.masai.usecase;

import java.util.*;

import com.masai.bean.Seller;
import com.masai.dao.SellerLoginDao;
import com.masai.dao.SellerLoginDaoImpl;

public class LoginAsASeller {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seller Username or Email");
		String sEmail = sc.next();
		
		System.out.println("Enter Seller Password");
		String sPassword = sc.next();
		
		Seperator.seperate();
		
		SellerLoginDao dao = new SellerLoginDaoImpl();
		
		Seller seller = dao.loginSeller(sEmail, sPassword);
		
		if(seller != null) {
			
			System.out.println("Welcome "+seller.getsName());
			
			Seperator.seperate();
			
			boolean val = true;
			
			while(val) {
				System.out.println("Enter 1 For Password Change");
				System.out.println("Enter 2 For Username or Email Change");
				System.out.println("Enter 3 For Update Item List");
				System.out.println("Enter 4 For Add Item");
				System.out.println("Enter 5 For Delete The Item");
				System.out.println("Enter 6 To See Buyer List");
				System.out.println("Enter 7 To See Which Buyer Has Set Maximum Price For Perticular Item");
				
				Seperator.seperate();
				
				int num = sc.nextInt();
				
				switch(num) {
				case 1 : UpdatePassword.main(null);
				         break;
				case 2 : UpdateUsername.main(null);
				         break;
				case 3 : itemAlter();
				         break;
				case 4 : AddItem.main(null);
				         break;
				case 5 : DeleteItem.main(null);
				         break;
				case 6:  ViewBuyerList.main(null);
				         break;
				case 7: ViewMaxBiddingPriceById.main(null);
				break;
				}
				
				Seperator.seperate();
				
				val = false;
				
				System.out.println("Enter 1 For Exit");
				System.out.println("Enter 2 For Go Back");
				
				int num1 = sc.nextInt();
				
				switch(num1) {
				case 1: SellerBuyer.main(null);
				break;
				case 2: val = true;
				break;
				}
			}
			
		}else {
		
			boolean val = true;
			
			while(val) {
				
				Seperator.seperate();
				
				System.out.println("Enter 1 For Go Back");
				int num3 = sc.nextInt();
				
				val = false;
				
				if(num3==1) {
					LoginAsASeller.main(null);
					
					break;
				}else {
					System.out.println("Enter Right Details");
					
					val = true;
				}	
			}
			
			
		}
	}
	
	public static void itemAlter() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 For Updating The Price");
		System.out.println("Enter 2 For Updating The Quantity");
		
		Seperator.seperate();
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1: UpdateItemPrice.main(null);
		        break;
		case 2: UpdateQuantityOfItem.main(null);
		        break;
		}

	}
}
