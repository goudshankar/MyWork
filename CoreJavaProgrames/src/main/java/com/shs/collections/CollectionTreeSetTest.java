package com.shs.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> treeSet=new TreeSet<String>();
		treeSet.add("Ravi");
		treeSet.add("Shankar");
		treeSet.add("Uma");
		Iterator<String> itr=treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
