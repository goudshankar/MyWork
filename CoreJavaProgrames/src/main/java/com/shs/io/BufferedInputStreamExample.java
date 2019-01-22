package com.shs.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("FileSource\\testin.txt");
		BufferedInputStream bin=new BufferedInputStream(fis);
		int i;
				while((i=fis.read())!=-1) {
					System.out.print((char)i);
				}
				bin.close();
				fis.close();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
