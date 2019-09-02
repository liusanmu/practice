package com.java.designpattern.factorymethod;


/**  
 * @Description: SmsSender.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:16:41   
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender!");
	}

}
