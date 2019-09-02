package com.java.oop.demo.hongbao;

import java.util.ArrayList;
import java.util.Random;

/**  
 *群员类
 */
public class Member extends User {
	
	
	
	public Member() {}
	
	public Member(String name, double leftMoney) {
		super(name, leftMoney);
	}

	public void open(ArrayList<Double> list){
		Random random = new Random();
		int index = random.nextInt(list.size());
		// 移除一个金额 
		Double  hb= list.remove(index);
		// 直接调用父类方法,设置到余额 
		setLeftMoney(hb);
		
	}
	
}
