package com.shs.opps;

public class MobileUser_ObjectCloning  implements Cloneable{
	int userId;
	String userName,email;
	long mobileNumber;
	//constructor to initialize variables
	MobileUser_ObjectCloning(int userId,String userName,String email,long mobileNumber){
		this.userId=userId;
		this.userName=userName;
		this.email=email;
		this.mobileNumber=mobileNumber;
	}
	//object clone methdod 
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		try {
		MobileUser_ObjectCloning mobileUser1=new MobileUser_ObjectCloning(10032, "kiran","abc@gmail.com", 9000087654L);
		MobileUser_ObjectCloning mobileUser2=(MobileUser_ObjectCloning)mobileUser1.clone();
		System.out.println(mobileUser1.userId+" "+mobileUser1.userName+" "+mobileUser1.email+" "+mobileUser1.mobileNumber);
		System.out.println(mobileUser2.userId+" "+mobileUser2.userName+" "+mobileUser2.email+" "+mobileUser2.mobileNumber);
		
		}catch(CloneNotSupportedException e) {}
		}
		
}
