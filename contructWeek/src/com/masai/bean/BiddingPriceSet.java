package com.masai.bean;

public class BiddingPriceSet {
	
	private int iId;
	private int iPrice;
	private int bId;
	
	public BiddingPriceSet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BiddingPriceSet [iId=" + iId + ", iPrice=" + iPrice + ", bId=" + bId + "]";
	}

	public BiddingPriceSet(int iId, int iPrice, int bId) {
		super();
		this.iId = iId;
		this.iPrice = iPrice;
		this.bId = bId;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}
	
}
