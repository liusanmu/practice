package it.ex9_thead.threadmethod;
/**  
 * @Description: Daemon.java
 * @author: liusen
 * @date:   2019年3月8日 上午11:00:32   
 * @version V2.0
 */
public class Daemon {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 2; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...bb");
				}
			}
		};
		//设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
		t2.setDaemon(true);		//设置为守护线程
		t1.start();
		t2.start();

	}
	
	

}
