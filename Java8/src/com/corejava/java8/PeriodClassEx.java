package com.corejava.java8;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClassEx {

	public static void main(String[] args) {
		LocalDate bdy= LocalDate.of(2022,01,07);
		 
		 LocalDate tdy=LocalDate.now();
		 
		 Period p= Period.between(bdy,tdy);
		 
		 System.out.println("Years is:"+p.getYears());
		 System.out.println("Months is:"+p.getMonths());
		 System.out.println("Days is:"+p.getDays());
		 
	     System.out.printf("Age is  %d years %d months %d days ",p.getYears(),p.getMonths(),p.getDays());	 
	}

}
