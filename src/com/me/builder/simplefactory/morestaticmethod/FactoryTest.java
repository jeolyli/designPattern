package com.me.builder.simplefactory.morestaticmethod;

import com.me.builder.simplefactory.publicsimplefactory.Sender;

/** 
* @author jialili 
*/
public class FactoryTest {
	public static void main(String[] args) {
		Sender produceMail = SendFactory.produceMail();
		produceMail.send();
	}

}
