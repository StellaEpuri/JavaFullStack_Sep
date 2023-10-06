package com.corejava.oops;

class Parent2{
	
	void parentMethod() {
		
		System.out.println("this is parent class method");
	}
}
class Child1 extends Parent2{
	
	void childMethod1() {
		
		System.out.println("this is child1 method");
	}
}
public class HierarchialEx extends Parent2{//child2

	void childMethod2() {
		
		System.out.println("this is child2 method");
	}
	public static void main(String[] args) {
		
		HierarchialEx hi=new HierarchialEx();
		
		hi.childMethod2();

		hi.parentMethod();
		
		Child1 ch1=new Child1();
		
		ch1.childMethod1();
		
		ch1.parentMethod();
		
	}

}
