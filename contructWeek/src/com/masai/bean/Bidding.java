package com.masai.bean;

public class Bidding {
	
	private int iId;
	private int bId;
	
	public Bidding() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bidding [iId=" + iId + ", bId=" + bId + "]";
	}

	public Bidding(int iId, int bId) {
		super();
		this.iId = iId;
		this.bId = bId;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}
	
}
