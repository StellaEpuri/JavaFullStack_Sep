package com.corejava.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//Duplicates are not allowed
//sorts alphabetically when given strings
//sorts in ascending order when integer data

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("stella");
		set.add("raju");
		set.add("nani");
		set.add("mano");
		set.add("stella");
		set.add("charan");
		set.add("avinash");
		
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();//to display the elements one by one
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		class ReverseOrder implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				
				//return -o1.compareTo(o2);
				return o2.compareTo(o1);
			}
		}
			TreeSet<String> set1=new TreeSet<String>(new ReverseOrder());
			
			set1.add("stella");
			set1.add("raju");
			set1.add("nani");
			set1.add("mano");
			set1.add("stella");
			set1.add("charan");
			set1.add("avinash");
			
			System.out.println(set1);
			
			
		}

	}


