package com.java.designpattern.factorymethod;

/**  
 * @Description: MailSender.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:15:57   
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender!");
	}

}
