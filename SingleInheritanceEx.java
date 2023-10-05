package com.corejava.oops;


class Parent{//A
	
	int marks=25;
	
	public void display() {
		
		System.out.println("this is a parent class method");
	}
}

public class SingleInheritanceEx extends Parent{//B

	void displayMsg() {
		
		System.out.println("this is child class method");
	}
	public static void main(String[] args) {
		
		SingleInheritanceEx obj=new SingleInheritanceEx();
		
		obj.displayMsg();
		
		obj.display();
		
		System.out.println("marks :"+obj.marks);
		
	}

}
