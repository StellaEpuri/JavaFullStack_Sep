package com.corejava.collections;

import java.util.ArrayList;

//duplicates are allowed
//insertion order is preserved

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("java");
		al.add(125);
		al.add(25.88f);
		al.add(true);
		al.add("java");
		al.add(56);
		al.add("collections");
		al.add(1,"stella");
		System.out.println(al.get(2));
		
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList();//Generics
		
		al1.add("stella");
		al1.add("java");
		al1.add("sandy");
		al1.add("stella");
		al1.add("java");

		System.out.println(al1);
		
		System.out.println(al);
	
		al.addAll(al1);
		al.retainAll(al1);
		System.out.println(al);
	}

}
