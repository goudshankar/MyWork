package com.shs.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fis=new FileOutputStream("FileSource\\customer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		Customer customer=new Customer();
		customer.setCustID(1004);
		customer.setCustomerName("Kishan");
		customer.setAddress("pune");
		oos.writeObject(customer);
		
		fis.close();
		oos.close();
	}

}
