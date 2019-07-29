package com.me.builder.simplefactory.publicsimplefactory;
/** 
* @author jialili 
*/
public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender produce = factory.produce("sms");
		produce.send();
	}

}
