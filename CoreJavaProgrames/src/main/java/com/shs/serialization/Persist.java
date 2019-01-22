package com.shs.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustID(123);
		customer.setCustomerName("rahul");
		customer.setAddress("pune");
		FileOutputStream fos=new FileOutputStream("FileSource\\f.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(customer);
		oos.flush();
		System.out.println("Serialization success..");
	}

}
