package com.java.designpattern.proxy;

/**
 * @Description: TestProxy.java
 * @author: lsm
 * @date: 2019年1月5日 下午3:56:55
 */
public class TestProxy {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}

interface Sourceable {

	public void method();

}

class Source implements Sourceable {
	@Override
	public void method() {
		System.out.println("the original method!");
	}
}

class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		atfer();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}

}
