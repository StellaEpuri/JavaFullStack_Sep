package com.corejava.arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		String[] name = { "stella", "sandy", "charan" };

		name[2] = "avinash";
		System.out.println(name[2]);

		for (int i = 0; i < 3; i++) {
			System.out.println(name[i]);

		}
		System.out.println("printing name array");
		for (String s : name) {// stella,sandy
			System.out.println(s);// stella,
		}

		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			names[i] = "welcome";
		}

		System.out.println("printing names array");
		for (String s : names) {// stella,sandy
			System.out.println(s);// stella,
		}
	}

}
