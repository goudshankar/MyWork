package com.shs.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionPriorityQueueTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Amit sharma");
		queue.add("");
		queue.add("Jai shankar");
		queue.add("Garima sing");
		System.out.println("Head:"+queue.element());
		//System.out.println("head:"+queue.peek());
		System.out.println("Iterating elements through iterator:");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
