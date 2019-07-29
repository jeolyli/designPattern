package com.me.builder.simplefactory.publicsimplefactory;
/** 
* @author jialili 
*/
public class SmsSender implements Sender{

	@Override
	public void send() {

		System.out.println("this is sms sender");
	}

}
