package com.corejava.collections;

import java.util.HashSet;

//Duplicates are not allowed
//insertion order is not preserved

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(125);
		set.add("sandy");
		set.add(250.5);
		set.add(false);
		set.add("java");
		set.add("sandy");
		
		System.out.println(set);
		
		HashSet<Integer> set1=new HashSet();
		set1.add(152);
		set1.add(850);
		set1.add(989);
		set1.add(2000);
		set1.add(850);
		set1.add(989);
		
		System.out.println(set1);
		
	}

}
