package com.shs.opps;
/* This2AsArgumentInConstructor
 *  */
public class B{
	A4 obj;
	B(A4 obj){
		this.obj=obj;
	}
	void dispaly() {
		System.out.println(obj.data);
	}
}
