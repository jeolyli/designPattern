package com.me.builder.simplefactory.publicsimplefactory;
/** 
* @author jialili 
*/
public class MailSender implements Sender{

	@Override
	public void send() {

		System.out.println("this is mailsender");
	}

}
