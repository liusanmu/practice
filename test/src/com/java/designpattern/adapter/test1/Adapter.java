package com.java.designpattern.adapter.test1;
/**  
 * @Description: Adapter.java 类的适配器模式
 * @author: lsm
 * @date: 2019年1月4日 下午6:08:55   
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
	
	public static void main(String[] args) {
		Targetable target =  new Adapter();
		target.method1();
		target.method2();
	}

}
