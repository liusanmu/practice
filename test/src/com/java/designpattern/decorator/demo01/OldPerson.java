package com.java.designpattern.decorator.demo01;
/**  
 * @Description: 被装饰对象
 * @author: lsm
 * @date: 2019年1月5日 上午10:03:11   
 */
public class OldPerson implements Person {

	@Override
	public void eat() {
		System.out.println("吃饭");
	}

}
