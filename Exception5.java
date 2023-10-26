package com.corejava.exceptions;

public class Exception5 {

	public static void main(String[] args) {
		
		try {
			int a= 20/5;
			System.out.println(a);
			System.exit(0);
			
		}
		finally {
			System.out.println("finally block is executed always");
		}

		System.out.println("remaining code");
	}

}
