package com.masai.bean;

public class BuyerPurchasedData {
	
	private int buyerId;
	private String buyerName;
	private String itemName;
	private int itemId;
	private int originalPrice;
	private int lastPrice;
	
	public BuyerPurchasedData() {
		// TODO Auto-generated constructor stub
	}

	public BuyerPurchasedData(int buyerId, String buyerName, String itemName, int itemId, int originalPrice,
			int lastPrice) {
		super();
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.itemName = itemName;
		this.itemId = itemId;
		this.originalPrice = originalPrice;
		this.lastPrice = lastPrice;
	}

	@Override
	public String toString() {
		return "BuyerPurchasedData [buyerId=" + buyerId + ", buyerName=" + buyerName + ", itemName=" + itemName
				+ ", itemId=" + itemId + ", originalPrice=" + originalPrice + ", lastPrice=" + lastPrice + "]";
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(int lastPrice) {
		this.lastPrice = lastPrice;
	}
	
}
