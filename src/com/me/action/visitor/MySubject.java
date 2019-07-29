package com.me.action.visitor;
/** 
* @author jialili 
*/
public class MySubject implements Subject{

	@Override
	public void accept(Visitor vistor) {
		vistor.visit(this);
		
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
