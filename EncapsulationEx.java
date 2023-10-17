package com.corejava.oops;

class Student{
	
	private String name;
	
	public void setName(String name) {//setter method
	
		if(name.endsWith("a")) {
			this.name=name;	
		}
	}
	public String getName() {//getter method
		
		return name;
	}
}
public class EncapsulationEx {

	public static void main(String[] args) {
		
		Student st=new Student();
		st.setName("stella");
		System.out.println(st.getName());

	}

}
