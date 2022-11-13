package com.masai.bean;

public class SellItem {
	
	private int iId;
	private String iName;
	private int iPrice;
	private int iQuantity;
	private String iSoldUnsold;
	private String iCategory;
	
	public SellItem() {
		// TODO Auto-generated constructor stub
	}

	public SellItem(int iId, String iName, int iPrice, int iQuantity, String iSoldUnsold, String iCategory) {
		super();
		this.iId = iId;
		this.iName = iName;
		this.iPrice = iPrice;
		this.iQuantity = iQuantity;
		this.iSoldUnsold = iSoldUnsold;
		this.iCategory = iCategory;
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

	public String getiCategory() {
		return iCategory;
	}

	public void setiCategory(String iCategory) {
		this.iCategory = iCategory;
	}

	@Override
	public String toString() {
		return "SellItem [iId=" + iId + ", iName=" + iName + ", iPrice=" + iPrice + ", iQuantity=" + iQuantity
				+ ", iSoldUnsold=" + iSoldUnsold + ", iCategory=" + iCategory + "]";
	}
	
	
}
