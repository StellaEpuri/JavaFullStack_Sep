package com.corejava.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableEx {

	public static void main(String[] args) throws IOException {
		
		Employee emp=new Employee(100, "stella",50000 , "hr");
		
		FileOutputStream out=new FileOutputStream("employees.txt");
		ObjectOutputStream obj=new ObjectOutputStream(out);
		
		obj.writeObject(emp);
		
		System.out.println("employee saved successfully");
		
		
	}

}
