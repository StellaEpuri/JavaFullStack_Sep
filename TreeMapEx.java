package com.corejava.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//sorting order for keys
//duplicate values for same keys are overridden

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(101, "stella");
		map.put(105, "sandy");
		map.put(110, "raju");
		map.put(150, "avinash");
		map.put(800, "charan");
		map.put(220, "stella");
		map.put(101, "saanvika");

		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			int key=itr.next();
			System.out.println(key+":"+map.get(key));
			
		}

		System.out.println("================");
		
		Set<Entry<Integer,String>> entries=map.entrySet();
		
		Iterator<Entry<Integer,String>> itr1=entries.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
