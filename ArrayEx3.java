package com.corejava.arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//int[][] array1=new int[2][3];//2rows, 3columns

		int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};//3
		
		System.out.println(array1[1][0]);
		
		for (int i = 0; i < 3; i++) {//rows,1,2
			
			for (int j = 0; j < 3; j++) {//columns,1,2
				
				System.out.print(array1[i][j]+" ");//00,01,02
			}
			System.out.println();
		}
		
	}

}
