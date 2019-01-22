package com.shs.reflection;

public class NewInstanceMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c=Class.forName("Simple1");
			Simple1 s1=(Simple1)c.newInstance();
			s1.msg();
		}
		catch(Exception e) {System.out.println(e);}
	}

}
