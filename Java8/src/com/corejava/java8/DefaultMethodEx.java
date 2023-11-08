package com.corejava.java8;


interface Test {

	void absMethod();

	default void m1() {
		System.out.println("Default Method");
	}
}

public class DefaultMethodEx implements Test {

	public static void main(String[] args) {

		DefaultMethodEx def = new DefaultMethodEx();
		def.absMethod();
		def.m1();
	}
	@Override
	public void absMethod() {
		System.out.println("This is abstract method implementation");
	}
	
	public void m1() {
		System.out.println("Overriding the default method implementation");
	}
}
