package com.shs.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionArrayDequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Ajay sharma");
		deque.add("Vinay kumar");
		deque.add("karan");
		for(String str:deque) {
			System.out.println(str);
		}
		
	}

}
