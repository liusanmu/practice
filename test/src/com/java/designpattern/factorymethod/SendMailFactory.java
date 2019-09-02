package com.java.designpattern.factorymethod;
/**  
 * @Description: SendMailFactory.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:46:08   
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
