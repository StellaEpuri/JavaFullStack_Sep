package com.corejava.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream out=new FileInputStream("employees.txt");
		ObjectInputStream obj=new ObjectInputStream(out);
		
		Employee emp=(Employee) obj.readObject();
		System.out.println(emp);

		
	}

}
