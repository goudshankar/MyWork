package com.shs.opps;
/*Java Copy Constructor:There is no copy constructor in java like copy constructor in c++,
 * However we can copy the values of one object into another object by using different way.
 * 1.By Using constructor
 * 2.By assigning the values of one object into another object.
 * 3.By using clone() method of Object class.
 * */
public class JavaCopyConstructor {
	int id;
	String name;
	JavaCopyConstructor(int i,String n){
		id=i;
		name=n;
	}
	//constructor to initialize other object
	JavaCopyConstructor(JavaCopyConstructor jcc){
		id=jcc.id;
		name=jcc.name;
	}
	//display the values of an object 
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object
		JavaCopyConstructor jcc1=new JavaCopyConstructor(111,"karan");
		JavaCopyConstructor jcc2=new JavaCopyConstructor(jcc1);
		jcc1.display();
		jcc2.display();
	}

}
