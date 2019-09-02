package com.java.designpattern.factorymethod;
/**  
 * @Description: SendSmsFactory.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:45:47   
 */
public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
