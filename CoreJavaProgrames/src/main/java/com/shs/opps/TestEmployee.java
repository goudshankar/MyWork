package com.shs.opps;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		//set the object's state and behaviour by using object reference
		e1.insertRecord(101,"arjeet",45000);
		e2.insertRecord(102,"irfan",25000);
		e3.insertRecord(103,"nakul",45000);
		//display the values of object using display method
		e1.display();
		e2.display();
		e3.display();
	}

}
