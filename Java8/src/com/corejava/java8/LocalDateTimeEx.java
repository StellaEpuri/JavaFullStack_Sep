package com.corejava.java8;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);

		LocalDateTime dt1= LocalDateTime.of(1993, 12, 27, 03, 33, 10);
		 
	       System.out.println(dt);	

	       System.out.println(dt1);
	      
		  System.out.println("After six months:"+dt1.plusMonths(6));		
	       System.out.println("Before six months:"+dt1.minusMonths(6));
	}

}
