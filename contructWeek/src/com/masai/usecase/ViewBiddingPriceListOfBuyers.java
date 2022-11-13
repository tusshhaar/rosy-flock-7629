package com.masai.usecase;

import java.util.*;

import com.masai.bean.BiddingPriceSet;
import com.masai.dao.BiddingDao;
import com.masai.dao.BiddingDaoImpl;

public class ViewBiddingPriceListOfBuyers {
	
	public static void main(String[] args) {
		
		BiddingDao dao = new BiddingDaoImpl();
		
		List<BiddingPriceSet> list = dao.ViewBiddingList();
		
		list.forEach(s -> System.out.println(s));
	}
}
