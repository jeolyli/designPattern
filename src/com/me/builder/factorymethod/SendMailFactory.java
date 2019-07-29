package com.me.builder.factorymethod;
/** 
* @author jialili 
*/
public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
