package com.corejava.oops;

class Private2{
	
	int marks=99;
	
	 private void m1() {
		System.out.println("this is private method");
	}
}
public class Private1{

	public static void main(String[] args) {
		
		Private1 p1=new Private1();
		//p1.m1();
		
		Private2 p2=new Private2();
		//p2.m1();
		
		System.out.println(p2.marks);
		
	}

}
