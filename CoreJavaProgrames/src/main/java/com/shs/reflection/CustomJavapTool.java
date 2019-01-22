package com.shs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomJavapTool {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class c=Class.forName(args[0]);
		//Display the fields information
		System.out.println("Fields....");
		Field f[] =c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
		//Display the Constructor information
		System.out.println("Consturctors.....");
		Constructor con[] =c.getDeclaredConstructors();
		for(int i=0;i<con.length;i++) {
			System.out.println(con[i]);
		}
		//Display the Methods information
		System.out.println("Methods......");
		Method methods[]=c.getDeclaredMethods();
		for(int i=0;i<methods.length;i++)
			System.out.println(methods[i]);
		}
	}

