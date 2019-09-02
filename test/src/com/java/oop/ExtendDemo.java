package com.java.oop;


/**
 * 
 super ：代表父类的存储空间标识(可以理解为父亲的引用)。
 this ：代表当前对象的引用(谁调用就代表谁)。
 *子类的每个构造方法中均有默认的super()，调用父类的空参构造。手动调用父类构造会覆盖默认的super()。
  super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现。
 */
public class ExtendDemo {
		
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.showNum();
		System.out.println("====================================");
		MasterPhone mp = new MasterPhone();
		//mp.call();
		mp.testShow();
		
		
	}
	
}

class Phone{
	
	public void sendMessage(){
		System.out.println("发短信");
	}
	
	public void call(){
		System.out.println("打电话");
	}
	
	public void showNum(){
		
		System.out.println("展示来电号码");
	}
}

class MasterPhone extends Phone{
	
	@Override
	public void showNum() {
		// TODO Auto-generated method stub
		super.showNum();
		//显示来电姓名
		System.out.println("显示来电姓名");
		
	}
	
	public void  testShow() {
		this.showNum();
		super.showNum();
		
	}
}
