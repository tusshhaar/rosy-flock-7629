package com.masai.bean;

public class Item {
	
	private int iId;
	private String iName;
	private int iPrice;
	private int iQuantity;
	private String iSoldUnsold;
	private String category;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int iId, String iName, int iPrice, int iQuantity, String iSoldUnsold, String category) {
		super();
		this.iId = iId;
		this.iName = iName;
		this.iPrice = iPrice;
		this.iQuantity = iQuantity;
		this.iSoldUnsold = iSoldUnsold;
		this.category = category;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public int getiQuantity() {
		return iQuantity;
	}

	public void setiQuantity(int iQuantity) {
		this.iQuantity = iQuantity;
	}

	public String getiSoldUnsold() {
		return iSoldUnsold;
	}

	public void setiSoldUnsold(String iSoldUnsold) {
		this.iSoldUnsold = iSoldUnsold;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [iId=" + iId + ", iName=" + iName + ", iPrice=" + iPrice + ", iQuantity=" + iQuantity
				+ ", iSoldUnsold=" + iSoldUnsold + ", category=" + category + "]";
	}
	
	
}
