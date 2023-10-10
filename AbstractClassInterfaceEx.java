package com.corejava.oops;

interface SuperParent1{
	
	abstract void display();

}
abstract class AParent implements SuperParent1{
	
	void m2() {
		System.out.println("this is m2 method");
	}
	
	abstract void m3();
}
public class AbstractClassInterfaceEx extends AParent {

	void m1() {
		System.out.println("this is m1 method");
	}
	public static void main(String[] args) {
		
		AbstractClassInterfaceEx ai=new AbstractClassInterfaceEx();
		
		ai.m1();
		ai.display();
		ai.m3();
		ai.m2();
	}
	@Override
	void m3() {
		
		System.out.println("this is unimplemented method of AParent");
		
	}
	@Override
	public void display() {
	
		System.out.println("This is unimplemented method from interface");
	}

}
