package com.shs.reflection;

public class GetClass_MethodTest {
	
	public void printName(Object obj) {
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s=new Simple();
		GetClass_MethodTest t=new GetClass_MethodTest();
		t.printName(s);
	}

}
