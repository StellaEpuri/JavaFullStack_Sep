package com.corejava.oops;

public class ConstructorEx3 {

	int id;
	String name;

	ConstructorEx3() {

		System.out.println("this is default constructor");
	}

	ConstructorEx3(String n) {

		name = n;
		System.out.println("parameterizd constructor");

	}

	ConstructorEx3(int i, String n) {

		id = i;
		name = n;
		System.out.println("two parameterizd constructor ");
		System.out.println("overloaded constructor");
	}

	void display() {

		System.out.println(" id is:" + id + " and " + "name is:" + name);
	}

	public static void main(String[] args) {

		ConstructorEx3 cons = new ConstructorEx3();

		ConstructorEx3 cons1 = new ConstructorEx3("stella");

		ConstructorEx3 cons2 = new ConstructorEx3(101, "sandy");

		cons.display();
		cons1.display();
		cons2.display();

	}

}
