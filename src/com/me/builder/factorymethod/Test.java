package com.me.builder.factorymethod;
/** 
* @author jialili 
*/
public class Test {

	public static void main(String[] args) {
		Sender produce = new SendMailFactory().produce();
		produce.send();
	}
}
