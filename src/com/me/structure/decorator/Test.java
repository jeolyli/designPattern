package com.me.structure.decorator;
/** 
* @author jialili 
*/
public class Test {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
