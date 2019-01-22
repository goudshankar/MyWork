package com.shs.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("FileSource\\testout.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fos);
		String s="welcome to java";
		byte[] b=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fos.close();
		System.out.println("success");
	}

}
