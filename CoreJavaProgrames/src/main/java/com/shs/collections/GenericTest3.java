package com.shs.collections;

public class GenericTest3 {

	public static <E> void printArray(E[] elements) {
		for(E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray= {10,20,30,40,50};
		Character[] charArray= {'J','A','V','A'};
		System.out.println("Printing an Integer Array:");
		printArray(intArray);
		System.out.println("Printing an charArray:");
		printArray(charArray);
	}

}
