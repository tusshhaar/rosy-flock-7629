package com.masai.bean;

public class Buyer {
	
	private int bId;
	private String bName;
	private String bEmail;
	private String bPassword;
	private String bMob;
	
	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public Buyer(int bId, String bName, String bEmail, String bPassword, String bMob) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bEmail = bEmail;
		this.bPassword = bPassword;
		this.bMob = bMob;
	}

	@Override
	public String toString() {
		return "Buyer [bId=" + bId + ", bName=" + bName + ", bEmail=" + bEmail + ", bPassword=" + bPassword + ", bMob="
				+ bMob + "]";
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbEmail() {
		return bEmail;
	}

	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}

	public String getbPassword() {
		return bPassword;
	}

	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}

	public String getbMob() {
		return bMob;
	}

	public void setbMob(String bMob) {
		this.bMob = bMob;
	}
	
	
}
