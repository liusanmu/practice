package com.java.a;
/**  
 * @Description: Demo02.java
 * @author: liusen
 * @date:   2018年12月6日 下午7:19:55   
 * @version V2.0
 */
public class Demo02 {
	public static void main(String[] args) {
		ThreadDemo02 td2 =  new ThreadDemo02();
		td2.run();
		 new Thread(td2).start();;
	}
}

class ThreadDemo02 implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.err.println(i);
		}
	}
}
