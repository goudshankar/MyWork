package com.shs.basics;

public class CustomerComparable implements Comparable<CustomerComparable>{
	
	int customerId;
	String customerName;
	String address;
	
	public CustomerComparable(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}


	@Override
	public int compareTo(CustomerComparable cc) {
		// TODO Auto-generated method stub
		if(customerId==cc.customerId) {
			//return 0 if both objects are equal
			return 0;
		}
		else if(customerId>=cc.customerId){
			//return positive if obj1 has to come after obj2 
			return 1;
		}
		else {
			//return negative if obj1(customerId) has to come before obj2(cc)
			return -1;
		}
	}

}
