package com.cap.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Account {
	@Column(name = "accNo", length = 15)
	@Id
	private int accNo;
	@Column(name = "name", length = 15)
	private String name;
	@Column(name = "fName", length = 15)
	private String fName;
	@Column(name = "address", length = 20)
	private String address;
	@Column(name = "balance", length = 15)
	private int balance;

	public Account(String name, String fName, String address, int balance) {
		super();
		this.accNo = ran(1000, 9999);
		System.out.println(accNo);
		this.name = name;
		this.fName = fName;
		this.address = address;
		this.balance = balance;
	}

	// Random Function
	public int ran(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	@Override
	public String toString() {
		return "Account Info : \n accNum=" + accNo + ", name=" + name + ", fName=" + fName + ", address=" + address
				+ ", balance=" + balance + "\n";
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}
}