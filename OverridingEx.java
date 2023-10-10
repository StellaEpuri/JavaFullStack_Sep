package com.corejava.oops;

class Parent11 {

	int property() {// 100 more methods    

		return 100000000;

	}

	public void wedding() {
		System.out.println("sam");
	}
}

public class OverridingEx extends Parent11 {

	@Override
	public void wedding() {
		System.out.println("alia");
	}
	
	public static void main(String[] args) {

		OverridingEx child=new OverridingEx();
		
		child.wedding();
		
	}

}
