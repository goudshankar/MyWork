package com.shs.basics;
/* Java shift operators right shift operator >> Vs >>>
 *For positive numbers >> and >>> works as same
 *For negative numbers >> and >>> works different
 * */

public class OperatorRightShift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(20>>2);//20/2^2=20*4=>80
		System.out.println(20>>>2);//20/2^2=20*4=>80
		//for negative numbers
		System.out.println(-20>>2);//
		System.out.println(-20>>>4);

	}

}
