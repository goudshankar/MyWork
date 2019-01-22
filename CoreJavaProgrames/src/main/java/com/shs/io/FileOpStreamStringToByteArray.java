package com.shs.io;

import java.io.FileOutputStream;

public class FileOpStreamStringToByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fout=new FileOutputStream("FileSource\\string2byte.txt");
		String s="welcome to java";
		byte []b=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
