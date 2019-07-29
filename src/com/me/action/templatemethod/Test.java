package com.me.action.templatemethod;
/** 
* @author jialili 
*/
public class Test {
	
	public static void main(String[] args) {
		String exp = "8+8";  
		AbstractCalculator cal = new Plus();
		int calculate = cal.calculate(exp, "\\+");
		System.out.println(calculate);
	}

}
