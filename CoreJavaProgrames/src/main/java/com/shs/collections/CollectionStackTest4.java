package com.shs.collections;

import java.util.Iterator;
import java.util.Stack;

public class CollectionStackTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		stack.push("Ayush");
		stack.push("Amit");
		stack.push("Garvit");
		stack.push("Ashis");
		stack.push("Garima");
		stack.push("shankar");
		stack.pop();
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
