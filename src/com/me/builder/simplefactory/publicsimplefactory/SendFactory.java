package com.me.builder.simplefactory.publicsimplefactory;
/** 
* @author 多个方法简单工厂
*/
public class SendFactory {
	
	public Sender produce (String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} 
		System.out.println("请输入正确类型！");
		return null;
		
	}

}
