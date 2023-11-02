package com.corejava.collections;

import java.util.HashMap;

//insertion order is not preserved
//duplicate values for same keys are overridden

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "stella");
		map.put(105, "sandy");
		map.put(110, "raju");
		map.put(150, "avinash");
		map.put(800, "charan");
		map.put(220, "stella");
		map.put(101, "saanvika");
		
		System.out.println(map);
		

	}

}
