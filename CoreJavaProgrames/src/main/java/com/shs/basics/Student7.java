package com.shs.basics;

public class Student7 {
	int id;
	String name;
	Student7(){
		//0-param constructor
	}
	Student7(int i,String n){
		this.id=i;
		this.name=n;
	}
	void show() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student7 s1=new Student7(10,"shankar");
		Student7 s2=new Student7();
		s2.id=s1.id;
		s2.name=s1.name;
		s2.show();
		
	}

}
