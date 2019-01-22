package com.shs.reflection;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		Class<?> c=Class.forName("Mobile_PrivateMethodTest");
		Object obj=c.newInstance();
		Method method=c.getDeclaredMethod("msg",null);
		method.setAccessible(true);
		method.invoke(obj, null);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
