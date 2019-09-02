package com.java.designpattern.factory.test01;


/**  
 * @Description: SendFactory.java
 * @author: lsm
 * @date: 2019年1月2日 下午10:17:50   
 */
public class SendFactory {
	
	public Sender product(String type){
		
		if("mail".equals(type)){
			return new MailSender();
			
		}else if ("sms".equals(type)) {
			return new SmsSender();
		}else{
			System.out.println("类型错误！");
			return null;
			
		}
		
	}
	
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender mailSender = factory.product("sms1");
		mailSender.send();
		
	}

}
