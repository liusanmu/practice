package com.java.oop.demo.hongbao;

import java.util.ArrayList;

import com.sun.accessibility.internal.resources.accessibility;

/**  
 * @Description: QunZhu.java
 * @author: liusen
 * @date:   2019年3月20日 下午4:51:42   
 * @version V2.0
 */
public class QunZhu extends User {
	
	
	public QunZhu() {
		super();
	}

	public QunZhu(String name, double leftMoney) {
		super(name, leftMoney);
	}

	public ArrayList<Double> send(int money, int count){
	   double leftMoney  = getLeftMoney();
	   if (leftMoney < money) {
		return null;
	   }
	   //修改群主的钱
	   setLeftMoney(leftMoney-money);
	  // 创建一个集合,保存等份金额
	   ArrayList<Double> list = new ArrayList<>();
	   //扩大100倍,相当于折算成'分'为单位,避免小数运算损失精度的问题 
	   money = money * 100;
	   //每份的金额
	   int m = money /count;
	   //除不尽的取余
	   int n = money % count;
	   // 无论是否整除,n‐1份,都是每份的等额金额 
	   for (int i = 0; i < count - 1; i++) {
		  list.add(m /100.0);   
	   }
	   
	   if (n == 0) {
		   list.add(m /100.0);
      }else{
    	  // 不能整除, 最后一份的金额,是之前每份金额+余数金额
           list.add((m + n)/100.00);
	 }
	return list;
	   
  }

}
