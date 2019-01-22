package com.shs.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamReadAllCharacterFromAFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("FileSource\\testin.txt");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
				
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}//main
}
