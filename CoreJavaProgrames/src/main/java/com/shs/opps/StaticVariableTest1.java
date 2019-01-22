package com.shs.opps;
/* take student object to check static variable test*/
public class StaticVariableTest1 {
	int rollno;
	String name;
	static String college="ITS";
	//constructor
	StaticVariableTest1(int r,String n){
		this.rollno=r;
		this.name=n;
	}
	//display the object values
	void dispaly() {
		System.out.println("The given Object values are::"+rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableTest1 t1=new StaticVariableTest1(111,"shankar");
		StaticVariableTest1 t2=new StaticVariableTest1(222,"Ashok");
		//we can change the college name of all objects in oneline bcoz that college variable is static.
		//which will be at class level so whatever objects are associated with that class will be effected if we 
		//change the value of static variable.
		StaticVariableTest1.college="BITS";
		//call display method
		t1.dispaly();
		t2.dispaly();
		
	}

}
