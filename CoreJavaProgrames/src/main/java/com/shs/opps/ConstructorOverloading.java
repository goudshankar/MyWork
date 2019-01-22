package com.shs.opps;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	//create two args constructor
	public ConstructorOverloading(int i,String n) {
		id=i;
		name=n;
	}
	//create three args constructor
	public ConstructorOverloading(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	//display the values of constructor
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two objects of ConstructorOverloading class
		ConstructorOverloading col1=new ConstructorOverloading(166,"Kiran");
		ConstructorOverloading col2=new ConstructorOverloading(177,"Arjun",23);
		//call the method
		col1.display();
		col2.display();
		
	}

}
