package com.bank.bankdao;

import java.util.HashMap;

import com.bank.bankmodel.Account;

public class BankdaoImpl implements BankDao {

	HashMap<Long,Account> accounts = new HashMap<Long,Account>();
	
	@Override
	public String createAccount(Account account) {
		accounts.put(account.getAccNo(),account);
		return "account created successfully with accNo:"+account.getAccNo();
	}
	public float showBalance(Long accNo) {
		
		return accounts.get(accNo).getAccBalance();
	}
	@Override
	public float deposit(Long accNo, float depositAmount) {
		Account account = accounts.get(accNo);
		float updatedBalance = account.getAccBalance() + depositAmount;
		account.setAccBalance(updatedBalance);
		accounts.put(accNo, account);
		return updatedBalance;
	}
	@Override
	public float withdraw(Long accNo, float withdrawAmount) {
		Account account = accounts.get(accNo);
		float updatedBalance1 = account.getAccBalance() -withdrawAmount;
		account.setAccBalance(updatedBalance1);
		accounts.put(accNo, account);
		return updatedBalance1;
	}
	@Override
	public float fundTransfer(Long accNoFrom, Long accNoTo, float transferAmount) {
		float fromBalance=accounts.get(accNoFrom).getAccBalance();
		float toBalance=accounts.get(accNoTo).getAccBalance();
		float updatedFromBalance=fromBalance-transferAmount;
		float updatedToBalance=toBalance+transferAmount;
		accounts.get(accNoFrom).setAccBalance(updatedFromBalance);
		accounts.get(accNoTo).setAccBalance(updatedToBalance);
		accounts.put(accNoFrom, accounts.get(accNoFrom));
		accounts.put(accNoTo, accounts.get(accNoTo));
		return updatedFromBalance;
	}
	
	
}
