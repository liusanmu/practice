package com.java.b;
/**  
 *  @Description: WanShu.java
 *   一个数如果恰好等于它的因子之和,这个数就称为” ” 完数” ”.  例如 6 = 1+2+3 。
 *   编程找出0 1000  以内的所有完数
 * @author: liusen
 * @date:   2018年12月12日 下午3:24:04   
 */
public class WanShu {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i ; j++) {
				if (i % j == 0) {
					sum += j;
				}
				
			}
			if (sum == i) {
				System.out.print(sum +" = ");
				for (int j = 1; j < i ; j++) {
					if (i % j == 0) {
						System.out.print(j);
						System.out.print(" ");
					}
					
				}
				System.out.println();
			
			}
			
		}
	}

}
