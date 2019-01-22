package com.shs.basics;

public class ClassLoaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		//if you try to print classloader name of string it'll return null becoz it is an inbuilt 
		//class which is available in rt.jar file
		System.out.println(String.class.getClassLoader());
	}

}
