package com.shs.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.shs.opps.Employee;

public class SerializingEmpObjectToFile implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		try {
		FileOutputStream fout=new FileOutputStream("FileDestination\\emp.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp);
		System.out.println("success..");
		out.flush();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
