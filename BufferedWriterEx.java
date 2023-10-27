package com.corejava.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("sample2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		bw.write('c');
		bw.write("stella");
		bw.newLine();
		char ch[]= {'a','b','c'};
		bw.write(ch);
		bw.flush();
		bw.close();
		fw.close();
	
	}

}
