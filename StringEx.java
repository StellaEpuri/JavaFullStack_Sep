package com.corejava.string;

public class StringEx {

	public static void main(String[] args) {
		
		String name="welcome";
		name.concat("to india");
		//String result=name.concat("to india");
		//System.out.println(name);
		
		//by using literal syntax
		String name1="welcome";
		String name2="welcome";
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		
		//by using new keyword
		String name3=new String("Apple");
		String name4=new String("apple");
		
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
		System.out.println(name3.compareTo(name4));
		System.out.println(name3.equalsIgnoreCase(name4));
		System.out.println(name.charAt(0));
		
		//stringbuffer
		StringBuffer sb=new StringBuffer("java");
		sb.append("fullstack");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
		
		
		
	}

}
