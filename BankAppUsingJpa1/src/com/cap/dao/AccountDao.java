package com.cap.dao;

import com.cap.entity.Account;

public interface AccountDao {
	public abstract int createAccount(Account emp); // persist ,merge,remove

	public abstract Account getAccountDetails(int empId);// find

	public abstract int withdrawAmuont(int accNo, int amountToWithdraw);// will return updated balance

	public abstract int depositAmount(int accNo, int amountToDeposit);// will return updated balance

	public abstract int transferAmount(int fromAccNo, int toAccNo, int amountToTransfer);// will return updated balance

	public abstract void commitTransaction();// getTransaction().commit()

	public abstract void beginTransaction();// getTransaction().begin()
}
