package com.shs.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.shs.regex.User;

public class UserDeserializationTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("FileDestination\\userDetails.txt"));
		User user=(User)ois.readObject();
		System.out.println("UserName is:"+user.getUserName());
		System.out.println("UserPassword is:"+user.getPassword());
	}

}
