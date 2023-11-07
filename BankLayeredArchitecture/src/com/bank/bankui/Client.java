package com.bank.bankui;

import java.util.Scanner;

import com.bank.bankmodel.Account;
import com.bank.bankservice.BankServiceImpl;

public class Client {

	public static void main(String[] args) {

		long accNo;
		String accHolderName;
		String typeOfAccount;
		float accBalance;
		String address;
		long contactNo;
		boolean value = true;
		
		BankServiceImpl service = new BankServiceImpl();
		Account account;
		
		Scanner scan = new Scanner(System.in);
		while (value) {
			System.out.println("*****BANK APPLICATION*****");
			System.out.println("1.Create Account");
			System.out.println("2.Show Balance");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Fund Transfer");
			System.out.println("6.Exit");

			
			int option = scan.nextInt();
			switch (option) {

			case 1:
				System.out.println("you have opted to create account");
				System.out.println("enter your name:");
				accHolderName = scan.next();
				System.out.println("enter type of account:");
				typeOfAccount = scan.next();
				System.out.println("enter your balance:");
				accBalance = scan.nextFloat();
				System.out.println("enter your address:");
				address = scan.next();
				System.out.println("enter your contactNo:");
				contactNo = scan.nextLong();
				accNo = contactNo - 100000000;
				account = new Account(accNo, accHolderName, typeOfAccount, accBalance, address, contactNo);
				System.out.println(service.createAccount(account));
				break;
				
			case 2:
				System.out.println("Show Balance");
				System.out.println("Enter your accno:");
				accNo=scan.nextLong();
				float availableBalance=service.showBalance(accNo);
				System.out.println("your current Balance is:"+availableBalance);
				break;
				
			case 3:
				System.out.println("Deposit:");
				System.out.println("enter your accNo:");
			    accNo=scan.nextLong();
			    System.out.println("enter the amount to deposit:");
			    float depositAmount=scan.nextFloat();
			    float updatedBalance=service.deposit(accNo,depositAmount);
			    System.out.println("your updated balance after deposit:"+updatedBalance);
			    break;
			case 4:
				System.out.println("Withdraw:");
				System.out.println("enter your accNo:");
			    accNo=scan.nextLong();
			    System.out.println("enter the amount to withdraw:");
			    float withdrawAmount=scan.nextFloat();
			    float updatedBalance1=service.withdraw(accNo,withdrawAmount);
			    System.out.println("your updated balance after withdraw:"+updatedBalance1);
			    break;
			case 5:
				System.out.println("Fund Transfer:");
				System.out.println("enter your from accNo:");
				long accNoFrom=scan.nextLong();
				System.out.println("enter your To accNo:");
				long accNoTo=scan.nextLong();
				System.out.println("enter your amount to transfer:");
				float transferAmount=scan.nextFloat();
				float updatedBalance2=service.fundTransfer(accNoFrom,accNoTo,transferAmount);
				System.out.println("your updated balance after fundtransfer:"+updatedBalance2);
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
