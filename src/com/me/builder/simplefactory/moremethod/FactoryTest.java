package com.me.builder.simplefactory.moremethod;

import com.me.builder.simplefactory.publicsimplefactory.Sender;

/** 
* @author jialili 
*/
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender produceMail = factory.produceMail();
		produceMail.send();
	}

}
