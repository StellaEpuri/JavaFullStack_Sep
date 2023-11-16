package com.cap.dao;

import javax.persistence.EntityManager;

import com.cap.entity.Account;

public class AccountDaoImpl implements AccountDao {

	EntityManager entityManager = UtilJava.getEntityManager();

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public int createAccount(Account account) {
		entityManager.persist(account);
		int accNum = account.getAccNo();
		return accNum;
	}

	@Override
	public Account getAccountDetails(int accNo) {
		Account account = entityManager.find(Account.class, accNo);
		return account;
	}

	@Override
	public int withdrawAmuont(int accNo, int amountToWithdraw) {
		Account account = getAccountDetails(accNo);
		int exsistingBalance = account.getBalance();
		int updatedBalance = exsistingBalance - amountToWithdraw;
		account.setBalance(updatedBalance);// setting updated balance to db
		entityManager.merge(account);
		return updatedBalance;
	}

	@Override
	public int depositAmount(int accNo, int amountToDeposit) {
		Account account = getAccountDetails(accNo);
		int exsistingBalance = account.getBalance();
		int updatedBalance = exsistingBalance + amountToDeposit;
		account.setBalance(updatedBalance);// setting updated balance to db
		entityManager.merge(account);
		return updatedBalance;
	}

	@Override
	public int transferAmount(int fromAccNo, int toAccNo, int amountToTransfer) {
		Account fromAccount = getAccountDetails(fromAccNo);
		int fromExsistingBalance = fromAccount.getBalance();
		Account toAccount = getAccountDetails(toAccNo);
		int toExsistingBalance = toAccount.getBalance();
		int fromUpdatedBalance = fromExsistingBalance - amountToTransfer;
		int toUpdatedBalance = toExsistingBalance + amountToTransfer;
		fromAccount.setBalance(fromUpdatedBalance);// setting updated balance to db
		toAccount.setBalance(toUpdatedBalance);// setting updated balance to db
		entityManager.merge(fromAccount);
		entityManager.merge(toAccount);
		return fromUpdatedBalance;
	}
}
