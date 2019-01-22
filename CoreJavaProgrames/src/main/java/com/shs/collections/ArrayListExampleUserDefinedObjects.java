package com.shs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleUserDefinedObjects {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(101,"raghava","pune");
		Customer customer2=new Customer(102,"Amit","Hyd");
		Customer customer3=new Customer(103,"Arun","Hyd");
		ArrayList<Customer> alist=new ArrayList<Customer>();
		alist.add(customer1);
		alist.add(customer2);
		alist.add(customer3);
		//traverse the arrayList through Iterator
		Iterator<Customer> itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
