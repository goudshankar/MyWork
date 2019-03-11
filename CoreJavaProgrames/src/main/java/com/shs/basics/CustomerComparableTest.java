package com.shs.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CustomerComparable> list=new ArrayList<CustomerComparable>();
		list.add(new CustomerComparable(104,"shankar","pune"));
		list.add(new CustomerComparable(103, "Ashok","chennai"));
		list.add(new CustomerComparable(106,"Prabhu","hyd"));
		list.add(new CustomerComparable(102,"Ramesh","Mumbai"));
		Collections.sort(list);
		for( CustomerComparable cst:list) {
			System.out.println(cst.customerId+" "+cst.customerName+" "+cst.address);
		}
	}

}
