package com.shs.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<TBook> set=new TreeSet<TBook>();
		set.add(new TBook(101,"C","YK",5));
		set.add(new TBook(102,"Java","James",8));
		//traversing the elements from the treeSet
		/*Iterator<TBook> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());*/
		for(TBook b:set)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
	}

}
