package com.corejava.oops;

interface A{
	void m1();
}
interface B{
	void m1();	
}
public class MultipleInheritanceEx implements A,B{

	public static void main(String[] args) {
		
		MultipleInheritanceEx mi=new MultipleInheritanceEx();
		mi.m1();

	}

	@Override
	public void m1() {
		int a=10;
		int b=5;
		System.out.println(a*b);
		
		System.out.println(a+b);
		
	}

}
