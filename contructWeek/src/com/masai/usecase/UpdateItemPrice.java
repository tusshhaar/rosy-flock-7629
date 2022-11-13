package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ItemDao;
import com.masai.dao.ItemDaoImpl;

public class UpdateItemPrice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Price");
		int iPrice = sc.nextInt();
		
		System.out.println("Enter Item ID");
		int iId = sc.nextInt();
		
		ItemDao dao = new ItemDaoImpl();
		
		String str = dao.updatePrice(iPrice, iId);
		
		if(str!=null) {
			System.out.println(str);
		}else {
			System.out.println("Error...");
		}

	}
}
