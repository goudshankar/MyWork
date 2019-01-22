package com.shs.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializingPersist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("FileSource\\f.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Customer customer=(Customer)ois.readObject();
		ois.close();
		fis.close();
		//print the state of an object
		System.out.println("Customer Id:"+customer.getCustID());
	}

}
