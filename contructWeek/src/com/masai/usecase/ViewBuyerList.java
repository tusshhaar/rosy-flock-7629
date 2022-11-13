package com.masai.usecase;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;

public class ViewBuyerList {
	
	public static void main(String[] args) {
		
		BuyerDao dao = new BuyerDaoImpl();
		
		List<Buyer> list = dao.viewBuyerList();
		
		if(list.size()!=0) {
			list.forEach(s -> System.out.println(s));
		}else {
			System.out.println("No Data Found!");
		}
	}
}
