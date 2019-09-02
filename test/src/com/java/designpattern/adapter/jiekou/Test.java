package com.java.designpattern.adapter.jiekou;

/**
 * @Description: Test.java
 * @author: lsm
 * @date: 2019年1月4日 下午6:28:08
 */
public class Test {

	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}

}
