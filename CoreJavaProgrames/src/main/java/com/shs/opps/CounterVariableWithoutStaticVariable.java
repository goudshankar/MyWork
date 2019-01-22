package com.shs.opps;

public class CounterVariableWithoutStaticVariable {
	static int count=0;
	//constructor
	CounterVariableWithoutStaticVariable(){
		count++;
		System.out.println(count);
	}
	//display the object content
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterVariableWithoutStaticVariable c1=new CounterVariableWithoutStaticVariable();
		CounterVariableWithoutStaticVariable c2=new CounterVariableWithoutStaticVariable();
		CounterVariableWithoutStaticVariable c3=new CounterVariableWithoutStaticVariable();
		
	}

}
