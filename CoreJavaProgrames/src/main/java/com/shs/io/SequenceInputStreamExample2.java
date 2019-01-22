package com.shs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/* Read the data from the multiple file and stored in a file
 * */
public class SequenceInputStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis1=new FileInputStream("FileSource\\testin.txt");
			FileInputStream fis2=new FileInputStream("FileSource\\testin1.txt");
			FileOutputStream fout=new FileOutputStream("FileDestination\\testout.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1) {
				fout.write(i);
			}
			System.out.println("success");
			sis.close();
			fis1.close();
			fis2.close();
			fout.flush();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
