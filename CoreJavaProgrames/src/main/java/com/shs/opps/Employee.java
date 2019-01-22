package com.shs.opps;

public class Employee {
	int id;
	String name;
	float salary;
	public void insertRecord(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
