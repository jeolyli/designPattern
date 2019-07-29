package com.me.action.strategy;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int calculate = cal.calculate(exp);
		System.out.println(calculate);
	}

}
