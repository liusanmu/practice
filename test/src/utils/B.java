package utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: B.java
 * @author: liusen
 * @date:   2019年3月15日 上午11:12:23   
 * @version V2.0
 */
public  abstract class B {

	abstract void test();
	
	public void testName() throws Exception {
		String a="abc";

		String b="abc";

		if(a == b){

		System.out.println("a==b");

		}else{

		System.out.println("a!=b");}
	}
}
