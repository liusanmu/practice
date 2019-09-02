package it.ex9_thead.threadmethod;
/**  
 * @Description: CurrentThread.java
 * @author: liusen
 * @date:   2019年3月8日 上午10:49:48   
 * @version V2.0
 */
public class CurrentThread {

	public static void main(String[] args) {
		new Thread(){
			@Override
		public void run() {
			System.out.println(getName()+"---I'm child thread1");
		}}.start();;
		
		new Thread(new Runnable() {
			@Override
			public void run() {
			System.out.println(Thread.currentThread().getName()+"---I'm child thread2");
			}
		}).start();
		
		Thread.currentThread().setName("I'm main thread");
		System.out.println(Thread.currentThread().getName());
	}
}
