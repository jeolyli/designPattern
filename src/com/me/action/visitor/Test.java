package com.me.action.visitor;
/** 
* @author jialili 
*/
public class Test {
	
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}

}
