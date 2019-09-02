package it.ex9_thead.syn;
/**  
 * @Description: Demo1_Synchronized.java
 * @author: liusen
 * @date:   2019年3月8日 上午11:58:40   
 * @version V2.0
 */
public class Demo1_Synchronized {

	public static void main(String[] args) {
		final Printer p= new Printer();
		new Thread(){
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread(){
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	
  }
}
class Printer{
	
	Demo d = new Demo();
	public void print1(){
		//synchronized(new Demo()) {
		synchronized (d) {                       //同步代码块,锁机制,锁对象可以是任意的
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
		}
	}
	
	public void print2(){                           
		//synchronized(new Demo()) { 
		synchronized (d) {                        //锁对象不能用匿名对象,因为匿名对象不是同一个对象
			System.out.print("黑1");
			System.out.print("马1");
			System.out.print("程1");
			System.out.print("序1");
			System.out.print("员1");
			System.out.print("\r\n");
		}
	}
}

class Demo{}