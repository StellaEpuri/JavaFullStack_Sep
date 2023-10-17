package com.corejava.oops;

public class EmployeeEncapsulation {

	private int empId;
	private String empName;
	private int empSal;
	private String empDesg;
		
	@Override
	public String toString() {
		return "EmployeeEncapsulation [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesg="
				+ empDesg + "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	
	
	public EmployeeEncapsulation() {
	
	}

	public EmployeeEncapsulation(int empId, String empName, int empSal, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesg = empDesg;
	}
	
	
}
