package com.corejava.java8;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();// static method call

		System.out.println(date);

		LocalDate yesterday = date.minusDays(1);

		System.out.println("yesterday date is: " + yesterday);

		LocalDate tomorrow = date.plusDays(1);

		System.out.println("tomorrow date is: " + tomorrow);
		
		LocalDate nextmonth = date.plusMonths(1);

		System.out.println("nextmonth is: " + nextmonth);
		
		System.out.println("***********************************");
		
		  int dd=date.getDayOfMonth();
		
		  int mm=date.getMonthValue();
		  
		  int yyyy=date.getYear();
		  
		  System.out.println(dd+" "+mm+" "+yyyy);
		  
		 
		
	}

}
