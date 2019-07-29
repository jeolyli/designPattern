package com.me.builder.factorymethod;
/** 
* @author jialili 
*/
public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is smssender");
	}

}
