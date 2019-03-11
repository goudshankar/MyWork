package com.shs.collections;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	public Student(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		if(rollno==s1.rollno) {
			return 0;
			
		}else if(rollno>s1.rollno) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
