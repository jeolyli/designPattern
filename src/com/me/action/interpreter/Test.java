package com.me.action.interpreter;
/** 
* @author jialili 
*/
public class Test {
	
	public static void main(String[] args) {
		int result = new Plus().interpret(new Context(9, 2));
		System.out.println(result);
	}

}
