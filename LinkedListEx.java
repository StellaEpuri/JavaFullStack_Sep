package com.corejava.collections;

import java.util.LinkedList;
//same as ArrayList

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();

		al.add("java");
		al.add(125);
		al.add(25.88f);
		al.add(true);
		al.add("java");
		al.add(56);
		al.add("collections");

		System.out.println(al);

	}

}
