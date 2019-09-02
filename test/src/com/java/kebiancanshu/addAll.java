package com.java.kebiancanshu;
/**  
 * @Description: addAll.java
 * @author: liusen
 * @date:   2018年12月10日 上午10:05:35   
 */
public class addAll {
	
	public static String addAll(Integer ...args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum+"";
		
	}
	
	public static void main(String[] args) {
		System.out.println(addAll(1,2,-3));
	}

}
