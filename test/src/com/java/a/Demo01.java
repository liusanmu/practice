package com.java.a;

import java.util.List;

/**  
 * @Description: Demo01.java
 * @author: liusen
 * @date:   2018年12月6日 下午6:48:00   
 * @version V2.0
 */
public class Demo01 extends Thread {
	
	public static void main(String[] args) {
		ThreaDemo01 td1 = new ThreaDemo01();
		td1.run();
		td1.start();
	    for(int i=0;i<50;i++){
	        System.out.println("main run-----"+i);
	      }
	}
	
	
	
}

class ThreaDemo01 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for(int i=0;i<50;i++)
	        System.err.println("demo run-----"+i);
	      }
	
}