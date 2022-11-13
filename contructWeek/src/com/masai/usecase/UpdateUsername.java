package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerException;

public class UpdateUsername {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Username or Email");
		String sEmail = sc.next();
		
		System.out.println("Enter Seller ID");
		int sId = sc.nextInt();
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			String str = dao.updateSellerUsername(sEmail, sId);
			
			System.out.println(str);
		} catch (SellerException e) {
			
			System.out.println(e.getMessage());
		}
		

	}
}
