package com.java.a;

import static org.junit.Assert.*;

import java.rmi.dgc.DGC;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**  
 * @Description: Demo03.java
 * @author: liusen
 * @date:   2018年12月7日 上午8:43:55   
 * @version V2.0
 */
public class Demo03 {

	public static void main(String[] args) {
		/*ThreadTest test = new ThreadTest();
		 new Thread(test).start();
		 new Thread(test).start();
		 new Thread(test).start();
		 new Thread(test).start();
		 
		 ConcurrentHashMap<Object, Object>  map = new ConcurrentHashMap<Object, Object>();*/
		/*String s = "abc";
		String ss = "abc";
		String s3 = "abc"+"def";  //此处编译器做了优化!
		String s4 = "abcdef";
		String s5 = ss+"def";
		String s2 = new String("abc");
		System.out.println(s==ss); //true
		System.out.println(s3==s4); //true
		System.out.println(s4==s5);  //false
		System.out.println(s4.equals(s5));	// true
*/
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date(millis);
		System.err.println(df.format(date));
		
	}
	
	@Test
	public void test01() throws Exception {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.err.println(df.format(date));
	}
	
	@Test
	public void test02() throws Exception {
		
		
	}
}

class ThreadTest implements Runnable{
	  private int ticket = 100;
	  public void run(){
	      while(true){
	      if(ticket > 0){
	      System.out.println(Thread.currentThread().getName() +
	          " is saling ticket" + ticket--);
	      }else{
	         break;
	      }
	    }
	  }
	}