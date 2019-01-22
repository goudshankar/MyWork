package com.shs.opps;

public class Instanceof_Operator_DownCasting_Dog extends InstanceofOperator_DownCasting_Animal {

	static void method(InstanceofOperator_DownCasting_Animal animal) {
		if(animal instanceof Instanceof_Operator_DownCasting_Dog) {
			Instanceof_Operator_DownCasting_Dog d=(Instanceof_Operator_DownCasting_Dog)animal;
			System.out.println("Ok Downcasting performed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceofOperator_DownCasting_Animal animal=new Instanceof_Operator_DownCasting_Dog();
		Instanceof_Operator_DownCasting_Dog.method(animal);
	}

}
