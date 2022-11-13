package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ItemDao;
import com.masai.dao.ItemDaoImpl;

public class DeleteItem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item ID Which Should Be Deleted");
		
		Seperator.seperate();
		
		int id = sc.nextInt();
		
		ItemDao dao = new ItemDaoImpl();
		
		String str = dao.deleteItemById(id);
		
		if(str!=null) {
			System.out.println(str);
		}else {
			System.out.println("No Item Found");
		}

	}
}
