package com.corejava.fileio;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		File f=new File("sample.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
	}

}
