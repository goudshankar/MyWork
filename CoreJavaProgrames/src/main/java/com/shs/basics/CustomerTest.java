package com.shs.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> list=new ArrayList<Customer>();
		list.add(new Customer(5,"anirudh","chennai",27,4000));
		list.add(new Customer(3,"dhanush","madras",30,5000));
		list.add(new Customer(2,"shimbu","chennai",31,4000));
		list.add(new Customer(4,"vishal","pune",26,4000));
		//sorting by age
		/*System.out.println("Sorting by Age");
		Collections.sort(list, new AgeComparator());
		for(Customer cs:list) {
			System.out.println(cs.customerId+" "+cs.custName+" "+cs.address+" "+cs.age+" "+cs.price);
		}*/
		
	/*	//sorting by CustomerId(by defalut it'll sort as ascending order)
		System.out.println("Sorting by CustomerId");
		Collections.sort(list, new CustomerIdComparator());
		for(Customer cs:list) {
			System.out.println(cs.customerId+" "+cs.custName+" "+cs.address);
		}
	*/	
		/*//sorting by address(by default it'll sort as alpha betical order)
		System.out.println("Sorting by address");
		System.out.println("=====================");
		Collections.sort(list, new AddressComparator());
		for(Customer cs:list) {
			System.out.println(cs.customerId+" "+cs.custName+" "+cs.address);
		}*/
		
		//age comparator
		System.out.println("Sorting by age");
		System.out.println("=====================");
		Collections.sort(list, new AgeComparator());
		for(Customer c:list) {
			System.out.println(c.customerId+" "+c.custName+" "+c.age);
		}
		/*//sorting by name
		System.out.println("Sorting by name");
		System.out.println("=====================");
		Collections.sort(list, new NameComparator());
		for(Customer c:list) {
			System.out.println(c.customerId+" "+c.custName);
		}*/
	}

}
