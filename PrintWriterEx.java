package com.corejava.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("sample4.txt");
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println(100);
		pw.println(true);
		pw.println('d');
		pw.println("java");
		pw.println(101);
		pw.flush();
		pw.close();
		fw.close();
		
		System.out.println("file created successfully");
	}

}
