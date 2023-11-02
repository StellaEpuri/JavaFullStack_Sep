package com.corejava.collections;

import java.util.LinkedHashSet;

//Duplicates are not allowed
//insertion order is preserved

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet set=new LinkedHashSet();
		
		set.add("stella");
		set.add(250);
		set.add(55.55f);
		set.add(false);
		set.add("stella");
		set.add("java");
		
		System.out.println(set);

	}

}
