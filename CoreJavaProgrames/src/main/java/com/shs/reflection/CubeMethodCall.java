package com.shs.reflection;

import java.lang.reflect.Method;

import com.shs.strings.A;

public class CubeMethodCall {

	public static void main(String[] args) throws Exception, IllegalAccessException {
		// TODO Auto-generated method stub
		Class c=A1.class;
		Object obj=c.newInstance();
		
		Method m=c.getDeclaredMethod("cube", new Class[] {int.class});
		m.setAccessible(true);
		m.invoke(obj, 4);
	}

}
