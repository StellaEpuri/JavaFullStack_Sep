package com.corejava.java8;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println(time);

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();


		System.out.printf("%d:%d:%d:%d", h, m, s, ns);
		System.out.println();

		System.out.println(h + ":" + m + ":" + s + ":" + ns);
		
		System.out.println("**************************");
		
		LocalTime time2 = time.minusHours(2);
		System.out.println("Two hours before: "+time2);
		LocalTime time3 = time.minusMinutes(30);
		System.out.println("Thirty miutes before: "+time3);
		LocalTime time4 = time.plusHours(3);
		System.out.println("Three hours after: "+time4);
		LocalTime time5 = time.plusMinutes(15);
		System.out.println("Fifteen minutes after: "+time5);
	}

}
