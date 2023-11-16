package com.cap.client;

import java.util.Scanner;

import com.cap.entity.Account;
import com.cap.service.AccountService;
import com.cap.service.AccountServiceImpl;

public class Client {
	static Account account = null;
	static AccountService service = new AccountServiceImpl();

	public static void main(String[] args) {
		int accNo;
		int updatedBalance;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Bank Application");
			System.out.println("***********************");
			System.out.println("Choose One Option");
			System.out.println("1.Create Account \n2.To See Account Info \n3.To Withdraw \n4.To Deposit \n5.To Transfer");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Your Name");
				String name = scanner.next();
				System.out.println("Enter Your FirstName");
				String fName = scanner.next();
				System.out.println("Enter Your Address");
				String address = scanner.next();
				System.out.println("Enter Your balance");
				int balance = scanner.nextInt();
				account = new Account(name, fName, address, balance);
				accNo = service.createAccount(account);
				System.out.println("Account Created with AccNum :" + accNo);
				break;
			case 2:
				System.out.println("Enter AccountNum");
				accNo = scanner.nextInt();
				account = service.getAccountDetails(accNo);
				System.out.println("Account Details: ");
				System.out.println(account);
				break;
			case 3:
				System.out.println("Withdraw Amount");
				System.out.println("Enter AccountNum");
				accNo = scanner.nextInt();
				System.out.println("Enter Amount Withdraw");
				int amountToWithdraw = scanner.nextInt();
				updatedBalance = service.withdrawAmuont(accNo, amountToWithdraw);
				System.out.println("After Withdraw Updated Balance : " + updatedBalance);
				break;
			case 4:
				System.out.println("Deposit Amount");
				System.out.println("Enter AccountNum");
				accNo = scanner.nextInt();
				System.out.println("Enter Amount Deposit");
				int amountToDeposit = scanner.nextInt();
				updatedBalance =service.depositAmount(accNo, amountToDeposit);
				System.out.println("After Deposit Updated Balance : " + updatedBalance);
				break;
			case 5:
				System.out.println("Enter  Your AccountNum");
				int fromAccNo = scanner.nextInt();
				System.out.println("Enter  Receiver AccountNum");
				int toAccNo = scanner.nextInt();
				System.out.println("Enter Amount Transfer");
				int amountToTransfer = scanner.nextInt();
				updatedBalance = service.transferAmount(fromAccNo, toAccNo, amountToTransfer);
				System.out.println("After Fund Transfer Remaining Balance In Your Account:" + updatedBalance);
				break;
			default:
				System.out.println("Thank You!!!!");
				scanner.close();
				System.exit(0);
			}
		}
	}
}
