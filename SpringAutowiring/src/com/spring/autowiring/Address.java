package com.spring.autowiring;

public class Address {

	private int hno;
	private String colony;
	private String city;
	private int pincode;
	
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int hno, String colony, String city, int pincode) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
