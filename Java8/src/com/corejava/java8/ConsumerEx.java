package com.corejava.java8;

import java.util.function.Consumer;

//only SAM--accept()
//It only consumes(takes) i/p and doesn't return anything
//can be used to print information
public class ConsumerEx {

	public static void main(String[] args) {
		
		Consumer<String> c=s-> System.out.println(s);
		c.accept("sandy");
		c.accept("stella");
		
	}

}
