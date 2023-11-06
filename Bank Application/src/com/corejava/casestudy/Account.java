package com.corejava.casestudy;

public class Account {//POJO--Plain old java objects

	private long accNo;
	private String accHolderName;
	private String typeOfAccount;
	private float accBalance;
	private String address;
	private long contactNo;
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", typeOfAccount=" + typeOfAccount
				+ ", accBalance=" + accBalance + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(long accNo, String accHolderName, String typeOfAccount, float accBalance, String address,
			long contactNo) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.typeOfAccount = typeOfAccount;
		this.accBalance = accBalance;
		this.address = address;
		this.contactNo = contactNo;
	}
	
}
