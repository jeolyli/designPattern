package com.me.structure.proxy;
/** 
* @author jialili 
*/
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("the original method");
	}

}
