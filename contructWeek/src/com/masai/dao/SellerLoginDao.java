package com.masai.dao;

import com.masai.bean.Seller;

public interface SellerLoginDao {
	
	public Seller loginSeller(String username, String password);
}
