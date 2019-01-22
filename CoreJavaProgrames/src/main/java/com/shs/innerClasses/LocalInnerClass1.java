package com.shs.innerClasses;

public class LocalInnerClass1 {
	private String userName;
	private String password;
	void getUserDetails() {
		class Local{
			void login(String userName,String password) {
			System.out.println(userName+"::logged in successfully...");				
			}
		}
		Local l=new Local();
		l.login("shankar","abc@123");
	}
	public static void main(String[] args) {
		LocalInnerClass1 linnerClass=new LocalInnerClass1();
		linnerClass.getUserDetails();
	}
}
