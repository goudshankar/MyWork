package com.shs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamWith4Files {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("FileSource\\a.txt");
		FileInputStream f2=new FileInputStream("FileSource\\b.txt");
		FileInputStream f3=new FileInputStream("FileSource\\c.txt");
		FileInputStream f4=new FileInputStream("FileSource\\d.txt");
		FileOutputStream fout=new FileOutputStream("FileDestination\\abcd.txt");
		//add the stream object to vector object
		Vector v=new Vector();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		v.add(f4);
		//create enumaration object and call the elements() method from vector
		Enumeration e=v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		int i=0;
		while((i=sis.read())!=-1) {
			fout.write(i);
		}
		
	}

}
