package com.corejava.casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {

		HashMap<Long,Account> accounts=new HashMap<Long,Account>();
		
		long accNo;
		String accHolderName;
		String typeOfAccount;
		float accBalance=10000;
		String address;
		long contactNo;
		boolean value=true;
		
		while(value) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bank Application");
		System.out.println("1.Create Account");
		System.out.println("2.Show Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Withdraw");
		System.out.println("5.Fund Transfer");
		System.out.println("6.Print statements");
		System.out.println("7.Exit");

		int option = scan.nextInt();

		switch (option) {
		case 1:
			System.out.println("Create Account:");
			System.out.println("Enter your name:");
			accHolderName = scan.next();
			System.out.println("Enter your address:");
			address = scan.next();
			System.out.println("Enter the type of account:");
			typeOfAccount = scan.next();
			System.out.println("Enter your contact Num:");
			contactNo = scan.nextLong();
			accNo=contactNo-10000000;
			Account account =new Account(accNo, accHolderName, typeOfAccount, accBalance, address, contactNo);
			accounts.put(accNo, account);
			System.out.println("Account created successfully with AccNO:"+ accNo);
			break;

		case 2:

			System.out.println("2.Show Balance:");
			System.out.println("enter your accNO:");
			accNo=scan.nextLong();
			account=accounts.get(accNo);
			System.out.println("Your current balance is:"+account.getAccBalance());
			break;
			
		case 3:
			System.out.println("3.Deposit:");
			System.out.println("enter your accNO:");
			accNo=scan.nextLong();
			System.out.println("Enter the amount to deposit:");
			Float depositAmount=scan.nextFloat();
			account=accounts.get(accNo);
			Float existingAmount=account.getAccBalance();
			Float finalAmount=existingAmount+depositAmount;
			account.setAccBalance(finalAmount);
			accounts.put(accNo, account);
			System.out.println("your updated balance after deposit is:"+finalAmount);
			break;
			
		case 4:
			System.out.println("4.Withdraw:");
			System.out.println("enter your accNO:");
			accNo=scan.nextLong();
			System.out.println("Enter the amount to withdraw:");
			Float withdrawAmount=scan.nextFloat();
			account=accounts.get(accNo);
			Float existingAmount1=account.getAccBalance();
			Float finalAmount1=existingAmount1-withdrawAmount;
			account.setAccBalance(finalAmount1);
			accounts.put(accNo, account);
			System.out.println("your updated balance after withdrawal is:"+finalAmount1);
			break;
		case 5:

			System.out.println("5.Fund Transfer:");
			System.out.println("Enter your From Account:");
			long accNoFrom=scan.nextLong();
			System.out.println("Enter your To Account:");
			long accNoTo=scan.nextLong();
			System.out.println("Enter the amount to Transfer:");
			Float transferAmount=scan.nextFloat();
			
			Account fromAccount=accounts.get(accNoFrom);
			Account toAccount=accounts.get(accNoTo);
			
			float fromAccBalance=fromAccount.getAccBalance();
			float toAccBalance=toAccount.getAccBalance();
			
			float fromAccFinalBalance=fromAccBalance-transferAmount;
			float toAccFinalBalance=toAccBalance+transferAmount;
			
			fromAccount.setAccBalance(fromAccFinalBalance);
			toAccount.setAccBalance(toAccFinalBalance);
			
			accounts.put(accNoFrom, fromAccount);
			accounts.put(accNoTo, toAccount);
			System.out.println("your account balance after fund transfer is:"+fromAccount.getAccBalance());
			break;
		case 6:

			break;
			
		default:
			System.out.println("Thank you for banking with us");
			value=false;
			System.exit(0);
			scan.close();
			break;
		}
		}
	}

}
