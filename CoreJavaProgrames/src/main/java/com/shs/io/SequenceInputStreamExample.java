package com.shs.io;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/*Read the data from multiple files
 * */
public class SequenceInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis1=new FileInputStream("FileSource\\testin.txt");
		FileInputStream fis2=new FileInputStream("FileSource\\testout.txt");
		SequenceInputStream inst=new SequenceInputStream(fis1, fis2);
		int i;
		while((i=inst.read())!=-1) {
			System.out.print((char)i);
		}
		inst.close();
		fis1.close();
		fis2.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
