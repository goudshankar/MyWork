package com.shs.opps;

public class Customer1WithThisOperator {
	int cid;
	String c_name;
	double price;
	//constructor to initialize variable
	Customer1WithThisOperator(int cid,String c_name,double price){
		this.cid=cid;
		this.c_name=c_name;
		this.price=price;
	}
	//display the object values
	void display() {System.out.println(cid+" "+c_name+" "+price);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer1WithThisOperator ct1=new Customer1WithThisOperator(1023,"Karan",1000);
		ct1.display();
	}

}
