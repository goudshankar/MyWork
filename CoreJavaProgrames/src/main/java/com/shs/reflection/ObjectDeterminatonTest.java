package com.shs.reflection;

public class ObjectDeterminatonTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
		Class<?> c=Class.forName("Simple");
		
		/*Class c2=Class.forName("My");
		System.out.println(c2.isInterface());*/
		}
		catch(Exception e) {System.out.println(e);}
	}

}
