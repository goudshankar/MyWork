package com.shs.opps;

public class ParamConstructor {
	int id;
	String name;
	public ParamConstructor(int i,String n) {
		this.id=i;
		this.name=n;
	}
	//method to display
	void display() {
		System.out.println("The paramConstructor values are:"+id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two objects with differenct values
		ParamConstructor pc1=new ParamConstructor(143,"Love");
		ParamConstructor pc2=new ParamConstructor(27,"Friends");
		pc1.display();
		pc2.display();
	}

}
