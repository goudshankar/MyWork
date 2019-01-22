package com.shs.opps;

public class Student4 {
	
	int id;
	String name;
	static String college="ITS";
	static void change() {
		college="BITS";
	}
	//constructor to initialize varaible
	Student4(int i,String n){
		this.id=i;
		this.name=n;
	}
	//display to object values
	void display() {System.out.println(id+" "+name+" "+college);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the static method to change the variable value
		Student4.change();
		Student4 s1=new Student4(111,"Kiran");
		Student4 s2=new Student4(222,"Aryan");
		Student4 s3=new Student4(333,"nakul");
		s1.display();
		s2.display();
		s3.display();

	}

}
