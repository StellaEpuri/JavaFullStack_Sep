package com.corejava.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int firstNum=scan.nextInt();
		
		System.out.println("enter the second number");
		int secondNum=scan.nextInt();
		
		try {//risky code
		int result=firstNum/secondNum;
		System.out.println(result);
		}
		catch(ArithmeticException e) {//handling code
			System.out.println("Dont enter zero as denominator");
		}
		finally {
			System.out.println("executes everytime");//clean up code
		}
		System.out.println("remaining lines of code");
		
		
	}

}
