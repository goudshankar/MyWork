package com.shs.strings;

public class ToStringMethodTest {
	int id;
	String name;
	String email;
	long phoneNumber;
	
	public ToStringMethodTest(int id,String name,String email,long phoneNumber) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	//toString() method
	public String toString() {
		return id+" "+name+" "+email+" "+phoneNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethodTest tsmt=new ToStringMethodTest(143,"shankar", "abc@lovemail.com",90000223334l);
		System.out.println(tsmt);
	}

}
