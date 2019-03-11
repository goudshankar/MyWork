package com.shs.basics;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		Integer cs1=c1.customerId;
		Integer cs2=c2.customerId;
		return cs1.compareTo(cs2);
		
		
		// TODO Auto-generated method stub
		/*if(c1.customerId==c2.customerId) {
			return 0;
		}
		else if(c1.customerId>c2.customerId) {
			return 1;
		}
		else {
			return -1;
		}*/
		
		
	}

}
