package com.me.action.interpreter;
/** 
* @author jialili 
*/
public class Plus implements Expression{

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
