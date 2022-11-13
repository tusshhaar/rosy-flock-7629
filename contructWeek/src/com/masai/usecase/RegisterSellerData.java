package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Seller;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerException;

public class RegisterSellerData {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seller ID");
		int sId = sc.nextInt();
		
		System.out.println("Enter Seller Name");
		String sName = sc.next();
		
		System.out.println("Enter Seller Address");
		String sAddress = sc.next();
		
		System.out.println("Enter Seller Username/Email");
		String sEmail = sc.next();
		
		System.out.println("Enter Seller Mobile Number");
		String sMob = sc.next();
		
		System.out.println("Enter Seller Password");
		String sPassword = sc.next();
		
		Seperator.seperate();
		
		Seller seller = new Seller(sId, sName, sAddress, sEmail, sMob, sPassword);
		
		SellerDao dao = new SellerDaoImpl();
		
		try {
			String str = dao.registeredSeller(seller);
			
			System.out.println(str);
			
		} catch (SellerException e) {
			
			System.out.println(e.getMessage());
		}

	}
}
