package com.bank.bankmodel;

import java.util.Date;

public class Transaction {

	private int transId;
	private long accNoFrom;
	private long accNoTo;
	private float amount;
	private Date dateOfTrans;
	private String transType;
	private float balance;
	
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public long getAccNoFrom() {
		return accNoFrom;
	}
	public void setAccNoFrom(long accNoFrom) {
		this.accNoFrom = accNoFrom;
	}
	public long getAccNoTo() {
		return accNoTo;
	}
	public void setAccNoTo(long accNoTo) {
		this.accNoTo = accNoTo;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getDateOfTrans() {
		return dateOfTrans;
	}
	public void setDateOfTrans(Date dateOfTrans) {
		this.dateOfTrans = dateOfTrans;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transId, long accNoFrom, long accNoTo, float amount, Date dateOfTrans, String transType,
			float balance) {
		super();
		this.transId = transId;
		this.accNoFrom = accNoFrom;
		this.accNoTo = accNoTo;
		this.amount = amount;
		this.dateOfTrans = dateOfTrans;
		this.transType = transType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", accNoFrom=" + accNoFrom + ", accNoTo=" + accNoTo + ", amount="
				+ amount + ", dateOfTrans=" + dateOfTrans + ", transType=" + transType + ", balance=" + balance + "]";
	}
	
}
