package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Item;
import com.masai.dao.ItemDao;
import com.masai.dao.ItemDaoImpl;

public class AddItem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item ID");
		int iId = sc.nextInt();
		
		System.out.println("Enter Item Name");
		String iName = sc.next();
		
		System.out.println("Enter Item Price");
		int iPrice = sc.nextInt();
		
		System.out.println("Enter Item Quantity");
		int iQuantity = sc.nextInt();
		
		System.out.println("Enter Item Sold or Unsold");
		String iSoldUnsold = sc.next();
		
		System.out.println("Enter Item Category");
		String iCategory = sc.next();
		
		Item item = new Item(iId, iName, iPrice, iQuantity, iSoldUnsold, iCategory);
		
		ItemDao dao = new ItemDaoImpl();
		
		String msg = dao.addItem(item);
		
		if(msg!=null) {
			System.out.println(msg);
		}else {
			System.out.println("Error...");
		}

	}
}
