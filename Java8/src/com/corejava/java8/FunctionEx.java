package com.corejava.java8;

import java.util.function.Function;
//only SAM--apply()
//any i/p..performs operation..returns any type o/p

public class FunctionEx {

	public static void main(String[] args) {
		
		Function<String, Integer> fun = s -> s.length();

		System.out.println("The length of the string is: " + fun.apply("sandy"));
		
		Function<Integer,Integer> f=n->n*n;
		
		System.out.println("The square of the given number is:"+f.apply(4));
	}

}
