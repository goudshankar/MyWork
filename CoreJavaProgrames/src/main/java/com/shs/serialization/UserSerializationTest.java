package com.shs.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.shs.regex.User;

public class UserSerializationTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("FileDestination\\userDetails.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		User user=new User("raja","rani");
		oos.writeObject(user);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("serialization success..");
	}

}
