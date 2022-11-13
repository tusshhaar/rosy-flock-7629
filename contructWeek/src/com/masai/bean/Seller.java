package com.masai.bean;

public class Seller {
	
	private int sId;
	private String sName;
	private String sAddress;
	private String sEmail;
	private String eMob;
	private String ePassword;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int sId, String sName, String sAddress, String sEmail, String eMob, String ePassword) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sEmail = sEmail;
		this.eMob = eMob;
		this.ePassword = ePassword;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String geteMob() {
		return eMob;
	}

	public void seteMob(String eMob) {
		this.eMob = eMob;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	@Override
	public String toString() {
		return "Seller [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + ", sEmail=" + sEmail + ", eMob="
				+ eMob + ", ePassword=" + ePassword + "]";
	}
	
	
}
