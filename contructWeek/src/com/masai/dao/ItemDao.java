package com.masai.dao;

import java.util.List;

import com.masai.bean.Item;

public interface ItemDao {
	
	public String addItem(Item item);
	
	public String updatePrice(int iPrice, int iId);
	
	public String updateQuantity(int iQuantity, int iId);
	
	public List<Item> viewItemList();
	
	public String deleteItemById(int iId);

}
