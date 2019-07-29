package com.me.builder.simplefactory.morestaticmethod;

import com.me.builder.simplefactory.publicsimplefactory.MailSender;
import com.me.builder.simplefactory.publicsimplefactory.Sender;
import com.me.builder.simplefactory.publicsimplefactory.SmsSender;

/** 
* @author 静态工厂方法模式
*/
public class SendFactory {
	
	public static Sender produceMail() {
		return new MailSender();
		
	}
	
	public static Sender produceSms () {
		return new SmsSender();
	}

}
