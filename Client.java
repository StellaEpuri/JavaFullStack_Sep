package com.corejava.oops;

public class Client {

	public static void main(String[] args) {
		
		EmployeeEncapsulation emp=new EmployeeEncapsulation();
		
		EmployeeEncapsulation emp1=new EmployeeEncapsulation(101, "sandy", 5000, "Hr");
		
		emp.setEmpId(121);
		emp.setEmpName("stella");
		emp.setEmpSal(500);
		emp.setEmpDesg("Trainer");
		
		System.out.println(emp.toString());
		System.out.println(emp1);

	}

}
