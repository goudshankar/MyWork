package com.shs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("shankar");
		alist.add("jai");
		//alist.add(30); 
		String s=alist.get(1);
		System.out.println("Element is:"+s);
		Iterator<String> itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
