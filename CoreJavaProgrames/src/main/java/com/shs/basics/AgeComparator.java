package com.shs.basics;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer cs1, Customer cs2) {
		// TODO Auto-generated method stub
		Integer c1=cs1.age;
		Integer c2=cs2.age;
		return -c1.compareTo(c2);
		
		/*if(cs1.age==cs2.age) {
			return 0;
		}
		else if(cs1.age>=cs2.age) {
			return 1;
		}
		else {
			return -1;
		}*/
	}

}
