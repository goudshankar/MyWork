package com.shs.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Ravi");
		alist.add("Vijay");
		alist.add("Ajay");
		
		
		//serialization
		try {
			FileOutputStream fos=new FileOutputStream("file.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(alist);
			fos.close();
			oos.close();
			
			//deseialization
			FileInputStream fis=new FileInputStream("file.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList<String> list=(ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
