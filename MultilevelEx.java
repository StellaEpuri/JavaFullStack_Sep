package com.corejava.oops;

class SuperParent{
	
	int division(int a,int b) {
		
		System.out.println("this is division  method from superparent class");
		return a/b;
	}
}
class Parent1 extends SuperParent{
	
	int multiplication(int a,int b) {
		
		System.out.println("this is multiplication method from parent class");
		return a*b;
	}
	
}
public class MultilevelEx extends Parent1{

	int addition(int a,int b) {
		
		System.out.println("this is addition method from child class");
		
		return a+b;
		
	}
	public static void main(String[] args) {
		
		MultilevelEx mi=new MultilevelEx();
		
		System.out.println("addition of two numbers:"+mi.addition(10, 50));
		
		System.out.println("multiplication of two numbers:"+mi.multiplication(10, 50));
		
		System.out.println("division of two numbers:"+mi.division(10, 5));
	}

}
