package com.corejava.java8;

import java.util.Date;
import java.util.function.Supplier;

//only SAM--get()
//doesn't take any i/p...supplies the desired o/p

public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());

	}

}
