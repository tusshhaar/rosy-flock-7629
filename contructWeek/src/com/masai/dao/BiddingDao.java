package com.masai.dao;

import java.util.List;

import com.masai.bean.Bidding;
import com.masai.bean.BiddingPriceSet;
import com.masai.bean.BuyerPurchasedData;

public interface BiddingDao {
	
//	public String biddingPrice(int iPrice, int iId);
	
	public String insertData(Bidding bid);
	
	public String setPriceForBidding(BiddingPriceSet bid);
	
	public List<BiddingPriceSet> ViewBiddingList();
	
	public List<BuyerPurchasedData> buyerPurchase(int iId);
	
	public String deleteItemFromBidding(int iId);
}
