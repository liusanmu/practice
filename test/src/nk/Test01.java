package nk;

import static org.junit.Assert.*;

import org.junit.Test;

/**  
 * @Description: Test01.java
 * @author: liusen
 * @date:   2019年2月27日 下午4:53:57   
 * @version V2.0
 */
public class Test01 {
	
	@Test
	public void test1() throws Exception {
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.err.println(str1 == str2);
	}
	
	@Test
	public void test2() throws Exception {
		
		System.out.println("is "+ 100 + 5);
		System.out.println(100 + 5 +" is");
		System.out.println("is "+ (100 + 5));
	}
	
	@Test
	public void test3() throws Exception {
		String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
	    System.out.println(classFile);
	    // ///////MyClass.class
	}
	
	
		void waitForSignal() throws InterruptedException
		{
		    Object obj = new Object();
		    synchronized(Thread.currentThread())
		    {
		        obj.wait();
		        obj.notify();
		    }
		}
	
}
