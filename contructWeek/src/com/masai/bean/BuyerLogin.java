package com.masai.bean;

public class BuyerLogin {
	
	private String bEmail;
	private String bPassword;
	
	public BuyerLogin() {
		// TODO Auto-generated constructor stub
	}

	public BuyerLogin(String bEmail, String bPassword) {
		super();
		this.bEmail = bEmail;
		this.bPassword = bPassword;
	}

	@Override
	public String toString() {
		return "BuyerLogin [bEmail=" + bEmail + ", bPassword=" + bPassword + "]";
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
	
}
