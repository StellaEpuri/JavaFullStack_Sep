package com.corejava.exceptions;

public class Exception4 {

	public static void main(String[] args) {

		try {
			int x = 12 / 3;
			try {
				int b = 40 / 2;
				try {
					int a[] = new int[5];
					a[5] = 4;
				} finally {
					System.out.println("inner finally block");
				}
				System.out.println("remaining try statements");
			} catch (ArithmeticException e) {
				System.out.println("dont enter zero as denominator");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("max size is 4");
			}
		} 
		catch (Exception e) {
			System.out.println("handles all exceptions");
		} finally {
			System.out.println("executes everytime");
		}

		System.out.println("remaining lines of code...normal termination");
	}

}
