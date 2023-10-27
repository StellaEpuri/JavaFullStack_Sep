package com.corejava.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {


		FileReader fr=new FileReader("sample4.txt");
		
		int i=fr.read();
		
		while(i != -1) {
			System.out.println((char)i);
			i=fr.read();
		}
		
	}

}
