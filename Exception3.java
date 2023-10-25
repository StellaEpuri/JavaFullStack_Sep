package com.corejava.exceptions;

public class Exception3 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[4] = 50 / 2;
			String s = "stella";
			int x = Integer.parseInt(s);
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("max index is 4");
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		} catch (NumberFormatException e) {
			System.out.println("we cant convert string into integer");
		} catch (Exception e) {
			System.out.println("unable to find the length");
		} finally {
			System.out.println("executes all the time");
		}
		System.out.println("remaining lines of code");
	}

}
