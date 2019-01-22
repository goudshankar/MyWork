package com.shs.io;

import java.io.FileInputStream;

public class FileInputStreamReadSingleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("FileSource\\testout.txt");
		int i=fis.read();
		System.out.println((char)i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
