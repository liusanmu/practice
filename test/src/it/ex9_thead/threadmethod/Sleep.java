package it.ex9_thead.threadmethod;

import org.junit.Test;

/**  
 * @Description: Sleep.java
 * @author: liusen
 * @date:   2019年3月8日 上午10:54:35   
 * @version V2.0
 */
public class Sleep {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void test(){
		try {
			
			for (int i = 20; i > 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
				
		
	}
	

}
