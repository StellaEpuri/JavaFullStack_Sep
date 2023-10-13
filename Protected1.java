package com.corejava.oops;

//accessible anywhere within the package,but outside the package,
//only when there is parent-child relationship

class Protected2{
	
	protected void hello() {
		System.out.println("this iis a protected method from Protected2 class");
	}
}
public class Protected1 extends Protected2 {

	protected int marks=100;
	
	public static void main(String[] args) {

		Protected1 pro1=new Protected1();
		System.out.println(pro1.marks);

		pro1.hello();
		Protected2 pro2=new Protected2();
		pro2.hello();
		
	}

}
