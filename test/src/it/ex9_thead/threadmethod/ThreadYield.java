package it.ex9_thead.threadmethod;
/**  
 * @Description:yield让出cpu礼让线程
 * @author: liusen
 * @date:   2019年3月8日 上午11:35:
 */
public class ThreadYield {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
	}
}


class MyThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (i % 10 == 0) {
				Thread.yield();
			}
			System.out.println(getName() + "..." + i);
		}
	}
}