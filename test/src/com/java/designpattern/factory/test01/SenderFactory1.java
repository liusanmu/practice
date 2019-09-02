package com.java.designpattern.factory.test01;


/**  
 * @Description: SenderFactory1.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:24:23   
 */
public class SenderFactory1 {
	
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
		
	}
	
	public static void main(String[] args) {
		Sender produceMail = SenderFactory1.produceMail();
		produceMail.send();
		Sender produceSms = SenderFactory1.produceSms();
		produceSms.send();
		
	}

}
