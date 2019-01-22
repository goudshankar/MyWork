package com.shs.opps;

public class CopyValuesWithoutConstructor {
	int id;
	String name;
	public CopyValuesWithoutConstructor(int i,String n) {
		id=i;
		name=n;
	}
	//default constructor
	public CopyValuesWithoutConstructor() {}
	//display value of an object
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyValuesWithoutConstructor c1=new CopyValuesWithoutConstructor(111,"kiran");
		CopyValuesWithoutConstructor c2=new CopyValuesWithoutConstructor();
		c2.id=c1.id;
		c2.name=c1.name;
		c1.display();
		c2.display();
	}

}
