package com.shs.collections;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();
		//creating books
		Book b=new Book();
		Book b1= new Book();
		Book b2=new Book();
		list.add(b1);
		list.add(b2);
		for(Book str:list) {
			System.out.println(str.toString());
		}
		
		
		
		
	}

}
