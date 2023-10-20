package com.corejava.arrays;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		
		int[] data=new int[size];
		
		System.out.println("enter the elements:");
		
		for (int i = 0; i < data.length; i++) {
			
			data[i]=sc.nextInt();
		}
		System.out.println("printing the data array:");
		
		for(int element:data) {
			
			System.out.println(element);
		}
		

	}

}
