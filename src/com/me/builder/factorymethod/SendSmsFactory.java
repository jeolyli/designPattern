package com.me.builder.factorymethod;
/** 
* @author jialili 
*/
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
