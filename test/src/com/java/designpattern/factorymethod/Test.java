package com.java.designpattern.factorymethod;
/**  
 * @Description: Test.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:46:40   
 */
public class Test {

	public static void main(String[] args) {
	Provider provider = new SendMailFactory();
	Sender sender = provider.produce();
	sender.send();
	Provider provider1 = new SendSmsFactory();
	Sender sender1 = provider1.produce();
	sender1.send();
	}
}
