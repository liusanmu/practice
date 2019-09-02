package it.ex9_thead.thread;
/**  
 * @Description: 证明jvm是多线程的
 * @author: liusen
 * @date:   2019年3月8日 上午9:56:10   
 * @version V2.0
 */
public class Demo1_thread {
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			System.out.println("我是主线程的执行代码");
		}
		for(int i = 0; i < 100; i++) {
			new Demo().finalize();
		}
		
		
	}
	

}
class Demo{
	@Override
	public void finalize(){
		//super.finalize();
		System.out.println("清扫垃圾！");
		
	}
	
}