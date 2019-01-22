package com.shs.opps;
/* Aggrigration Example:
 * Customer has an Object of Address,Address object contains its own information such as city,state and country
 * in this case Customer obj Has-A relation ship with Address object*/
public class Customer {
	int customerId;
	String customerName;
	Address address;
	/*Customer() {
		//default constructor to initailize variables
	}*/
	//constructor to initialize variables
	public Customer(int customerId,String customerName,Address address) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.address=address;
	}
	//method to dispaly the object values
	void display() {
		System.out.println("The customer details are:"+customerId+" "+customerName+" "+address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of address and customer
		Address address1=new Address("pune","MH","India");
		Address address2=new Address("Hyd","TG","India");
		Customer c1=new Customer(1002,"Kiran",address1);
		Customer c2=new Customer(1003,"nakul",address2);
		//call the display method
		c1.display();
		c2.display();
	}

}
