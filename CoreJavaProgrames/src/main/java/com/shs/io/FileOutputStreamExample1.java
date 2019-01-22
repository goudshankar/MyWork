package com.shs.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fout=new FileOutputStream("FileSource\\testout1.txt");
		fout.write(97);
		fout.close();
		System.out.println(fout.toString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
