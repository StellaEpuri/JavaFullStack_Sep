package com.corejava.java8;

@FunctionalInterface
interface Adder{
	
	void addition(int a,int b);
}
public class AddLambda {

	public static void main(String[] args) {
		
		Adder add=(a,b)->System.out.println("addition using lambda:"+(a+b));
		add.addition(15, 45);
	}

}
