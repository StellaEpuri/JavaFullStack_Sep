package com.corejava.java8;

import java.util.function.Predicate;

//only SAM--test()
//takes some i/p...performs conditional checking...returns boolean value

public class PredicateEx {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println("The given number 10 is even: "+p.test(10));
		
		System.out.println("The given number 25 is even: "+p.test(25));
	}

}
