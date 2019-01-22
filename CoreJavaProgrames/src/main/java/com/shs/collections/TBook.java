package com.shs.collections;

public class TBook implements Comparable<TBook> {

	int id;
	String name,author;
	int quantity;
	public TBook(){
		//0-param constructor
	}
	//Param constructor
	public TBook(int id, String name, String author, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	public int compareTo(TBook b) {
		// TODO Auto-generated method stub
		if(id>b.id) {
			return 1;
		}else if(id<b.id) {
			return -1;
		}else {
		return 0;
		}
	}
/*//toString()
	@Override
	public String toString() {
		return "TBook [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
	}
	
	*/
}
