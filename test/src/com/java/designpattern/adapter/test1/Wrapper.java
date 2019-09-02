package com.java.designpattern.adapter.test1;
/**  
 * @Description: Wrapper.java 对象的适配器模式
 * @author: lsm
 * @date: 2019年1月4日 下午6:14:41   
 */
public class Wrapper implements Targetable {

	private Source source;
	
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}
	
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}

}
