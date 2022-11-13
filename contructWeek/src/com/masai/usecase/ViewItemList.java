package com.masai.usecase;

import java.util.List;

import com.masai.bean.Item;
import com.masai.dao.ItemDao;
import com.masai.dao.ItemDaoImpl;

public class ViewItemList {
	
	public static void main(String[] args) {
		
		ItemDao dao = new ItemDaoImpl();
		
		List<Item> list = dao.viewItemList();
		
		if(list!=null) {
			list.forEach(s -> System.out.println(s));
		}else {
			System.out.println("List Is Empty!");
		}
	}
}
