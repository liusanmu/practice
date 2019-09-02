package com.java.oop.demo.hongbao;

import java.util.ArrayList;

/**  
 * @Description: TestHongBao.java
 * @author: liusen
 * @date:   2019年3月20日 下午5:26:45   
 * @version V2.0
 */
public class TestHongBao {
	
	
	public static void main(String[] args) {

		QunZhu qz = new QunZhu("群主",200);
		qz.show();
		ArrayList<Double> list = qz.send(250, 5);
		if (list == null) {
			System.out.println("余额不足");
			return;
			
		}
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		m1.open(list);
		m2.open(list);
		m3.open(list);
		
		qz.show();
		m1.show();
		m2.show();
		m3.show();

	}
	

}
