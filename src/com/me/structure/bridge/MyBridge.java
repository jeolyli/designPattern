package com.me.structure.bridge;
/** 
* @author jialili 
*/
public class MyBridge extends Bridge{
	
	public void method() {
		getSource().method();
	}

}
