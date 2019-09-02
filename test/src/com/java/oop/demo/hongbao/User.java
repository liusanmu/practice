package com.java.oop.demo.hongbao;
/**  
         群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
      1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
      2. 成员领取红包后，保存到成员余额中。
 */
public class User {
	
	private String name;  //账号
	private double leftMoney; //余额
	
	
	public User() {
	}
	
	public User(String name, double leftMoney) {
		super();
		this.name = name;
		this.leftMoney = leftMoney;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLeftMoney() {
		return leftMoney;
	}
	public void setLeftMoney(double leftMoney) {
		this.leftMoney = leftMoney;
	}
	
	public void show(){
		System.out.println("用户名:"+ name +" 余额:" + leftMoney);
	}
}
