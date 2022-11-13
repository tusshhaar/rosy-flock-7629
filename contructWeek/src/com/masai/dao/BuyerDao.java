package com.masai.dao;

import com.masai.bean.Buyer;
import com.masai.exception.BuyerException;
import java.util.*;

public interface BuyerDao {
	
	public String AddBuyer(Buyer buyer) throws BuyerException;
	
	public List<Buyer> viewBuyerList();
	
	
}
