package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerException;

public class UpdatePassword {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Password");
		String sPassword = sc.next();
		
		System.out.println("Enter Seller ID");
		int sId = sc.nextInt();
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			String str =  dao.updateSellerPassword(sPassword, sId);
			
			System.out.println(str);
		} catch (SellerException e) {
			
			System.out.println(e.getMessage());
		}

	}
}
