package com.shs.opps;

public class ConstructorChaining {
	int rollno;
	String name,course;
	float fee;
	//constructor1
	ConstructorChaining(int rollno,String name,String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	//constructor to reuse
	ConstructorChaining(int rollno,String name,String course,float fee){
		this(rollno,name,course);
		this.fee=fee;
	}
	//to display the object values
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining cc1=new ConstructorChaining(111,"ankit","java");
		ConstructorChaining cc2=new ConstructorChaining(112,"sumit","java",6000f);
		cc1.display();
		cc2.display();
	}

}
