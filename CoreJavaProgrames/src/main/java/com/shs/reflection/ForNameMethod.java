package com.shs.reflection;

public class ForNameMethod {
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		Simple s=new Simple();
		Class c=Class.forName("Simple");
		System.out.println(c.getName());
		}
		catch(ClassNotFoundException cnf) {
			System.out.println(cnf);
		}
		}

}
