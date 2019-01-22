package com.shs.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;

import com.shs.opps.Employee;	

public class DeserializingFileToObject implements Serializable{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("FileSource\\employee.txt"));
		Employee emp=(Employee) ois.readObject();
	
		ois.close();
	}

}
