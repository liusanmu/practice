package it.ex9_thead.thread;
/**  
 * @Description: Demo3_thread.java
 * @author: liusen
 * @date:   2019年3月8日 上午10:27:49   
 * @version V2.0
 */
public class Demo3_thread {
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("runable.............");
				}
			}
		}).start();
		
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("thread.............");
				}
			}
			
		}.start();;
		
		
	}

}
