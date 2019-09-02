package it.ex9_thead.thread;
/**  
 * @Description: runnable实现线程
 * @author: liusen
 * @date:   2019年3月8日 上午10:16:46   
 * @version V2.0
 */
public class Demo2_thread {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main......");
		}
	}
	
}

class MyRunnable implements Runnable{ //1. 创建一个类实现Runnable

	@Override
	public void run() {               //2. 重写runnable       
		for (int i = 0; i < 1000 ; i++) {	
			System.out.println("runnable...");
		}
		
	}
	
}