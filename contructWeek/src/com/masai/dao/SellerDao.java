package com.masai.dao;

import com.masai.bean.Seller;
import com.masai.exception.SellerException;

public interface SellerDao {
	
	public String registeredSeller(Seller seller) throws SellerException;
	
	public String updateSellerPassword(String sPassword, int sId) throws SellerException;
	
	public String updateSellerUsername(String sEmail, int sId) throws SellerException;
}
