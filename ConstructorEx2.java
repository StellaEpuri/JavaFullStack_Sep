package com.corejava.oops;

public class ConstructorEx2 {
	
	int a;
	int b;
	
	public ConstructorEx2() {
		System.out.println("Inside constructor");
		a=10;
		b=20;
	}
	void display() {
		System.out.println("this is display method");
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
	}
	public static void main(String[] args) {
		
		ConstructorEx2 cons=new ConstructorEx2();
		cons.display();
	}

}
