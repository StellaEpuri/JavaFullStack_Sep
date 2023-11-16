package com.cap.service;

import com.cap.dao.AccountDao;
import com.cap.dao.AccountDaoImpl;
import com.cap.entity.Account;

public class AccountServiceImpl implements AccountService {
	AccountDao dao = new AccountDaoImpl();

	@Override
	public int createAccount(Account account) {
		dao.beginTransaction();
		int accNo = dao.createAccount(account);
		dao.commitTransaction();
		return accNo;
	}

	@Override
	public Account getAccountDetails(int accNo) {
		Account account = dao.getAccountDetails(accNo);
		return account;
	}

	@Override
	public int withdrawAmuont(int accNo, int amountToWithdraw) {
		dao.beginTransaction();
		int updatedBalance = dao.withdrawAmuont(accNo, amountToWithdraw);
		dao.commitTransaction();
		return updatedBalance;
	}

	@Override
	public int depositAmount(int accNo, int amountToDeposit) {
		dao.beginTransaction();// every DML Operation need to commit explicitly
		int updatedBalance = dao.depositAmount(accNo, amountToDeposit);
		dao.commitTransaction();
		return updatedBalance;
	}

	@Override
	public int transferAmount(int fromAccNo, int toAccNo, int amountToTransfer) {
		dao.beginTransaction();
		int updatedBalance = dao.transferAmount(fromAccNo, toAccNo, amountToTransfer);
		dao.commitTransaction();
		return updatedBalance;
	}
}
