package com.shs.opps;
/*  Student class ,main(-) method within class*/
public class Student {
	int id;
	String name;
	
	void insertRecord(int r,String n) {
		id=r;
		name=n;
	}
	void displayInformation() {
		System.out.println(id+" "+name);
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}*/


}
