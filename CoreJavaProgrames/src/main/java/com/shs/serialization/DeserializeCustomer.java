package com.shs.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeCustomer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("FileSource\\customer.txt"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Customer customer=(Customer) ois.readObject();
		System.out.println(customer.getCustID());
		System.out.println(customer.getCustomerName());
	}

}
