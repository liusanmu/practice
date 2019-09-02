package it.ex9_thead.threadmethod;



/**  
 * @Description: join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
* 				 join(int), 可以等待指定的毫秒之后继续
 * @author: liusen
 * @date:   2019年3月8日 上午11:14:19   
 * @version V2.0
 */
public class ThreadJoin {

	public static void main(String[] args) {
		
		final Thread t1 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName()+"---t1");
				}
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
						try {
							t1.join(1);
							System.out.println("t2暂停执行");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}					
				}
				System.out.println(getName() + "...t2");
			}
			
		};
		t2.start();
		t1.start();
		

	}

}
