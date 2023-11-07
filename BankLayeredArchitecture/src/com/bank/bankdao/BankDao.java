package com.bank.bankdao;

import com.bank.bankmodel.Account;

public interface BankDao {

	public abstract String createAccount(Account account);

	float showBalance(Long accNo);

	float deposit(Long accNo, float depositAmount);

	float withdraw(Long accNo, float withdrawAmount);

	float fundTransfer(Long accNoFrom, Long accNoTo, float transferAmount);

	


}
