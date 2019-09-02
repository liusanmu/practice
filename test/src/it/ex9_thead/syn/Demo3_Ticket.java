package it.ex9_thead.syn;
/**  
 * @Description: Demo3_Ticket.java
 * @author: liusen
 * @date:   2019年3月8日 下午12:23:13   
 * @version V2.0
 */
public class Demo3_Ticket {

	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}
}


class Ticket extends Thread{
	
    private static int num = 100;// 静态变量
	//int num=100;
	@Override
	public void run() {
		while (true) {
			synchronized (Ticket.class) {
				if (num<=0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(getName() + "...这是第" + num-- + "号票");
				
			}
			
		}
	}
	
	
}