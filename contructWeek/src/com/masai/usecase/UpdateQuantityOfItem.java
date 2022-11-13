package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ItemDao;
import com.masai.dao.ItemDaoImpl;

public class UpdateQuantityOfItem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Quantity");
		int iQuantity = sc.nextInt();
		
		System.out.println("Enter Quantity ID");
		int iId = sc.nextInt();
		
		ItemDao dao = new ItemDaoImpl();
		
		String msg = dao.updateQuantity(iQuantity, iId);
		
		if(msg!=null) {
			System.out.println(msg);
		}else {
			System.out.println("Error...");
		}

	}
}
