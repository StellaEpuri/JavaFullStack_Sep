package com.corejava.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileReader fr1=new FileReader("sample4.txt");
		BufferedReader br=new BufferedReader(fr1);
		
		String line=br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		
	}

}
