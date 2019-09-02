package it.ex9_thead.threadmethod;

import org.junit.Test;

/**  
 * @Description: ThreadName.java
 * @author: liusen
 * @date:   2019年3月8日 上午10:36:31   
 * @version V2.0
 */
public class ThreadName {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				//this.setName("张三");
				System.out.println(this.getName() + "....aaaaaaaaaaaaa");
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				//this.setName("李四");
				System.out.println(this.getName() + "....bb");
			}
		};
		
		
		t1.start();  
		t2.start();
		t1.setName("张三");
		t2.setName("李四");
		
	
	}
	
	@Test
	public void demo1() {
		new Thread("芙蓉姐姐") {							//通过构造方法给name赋值
			public void run() {
				System.out.println(this.getName() + "....aaaaaaaaa");
			}
		}.start();
		
		new Thread("凤姐") {
			public void run() {
				System.out.println(this.getName() + "....bb");
			}
		}.start();
	}


}
