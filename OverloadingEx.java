package com.corejava.oops;

public class OverloadingEx {

	public void add(int a, int b) {

		System.out.println("addition of two integers:" + (a + b));
	}

	public void add(int a, int b, int c) {

		System.out.println("addition of three integers:" + (a + b + c));
	}

	public void add(float a, float b) {

		System.out.println("addition of two float numbers:" + (a + b));
	}

	public void add(int a, float b) {

		System.out.println("addition of integer and float numbers:" + (a + b));
	}

	public void add(float a, int b) {

		System.out.println("addition of float and integer:" + (a + b));
	}

	public static void main(String[] args) {

		OverloadingEx cal = new OverloadingEx();

		cal.add(10, 20, 30);
		cal.add(23.5f, 20.4f);
		cal.add(155, 580.55f);
		cal.add('a','b');//type promotion

	}

}
