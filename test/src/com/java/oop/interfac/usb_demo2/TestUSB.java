package com.java.oop.interfac.usb_demo2;
/**  
 *  进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
    USB 接口，包含开启功能、关闭功能
	笔记本类，包含运行功能、关机功能、使用 USB设备功能
	鼠标类，要实现 USB接口，并具备点击的方法
	键盘类，要实现 USB接口，具备敲击的方法
 */
public class TestUSB {

	public static void main(String[] args) {
		USB mouse  = new Mouse();
		
		Laptop l = new Laptop();
		l.useUSB(mouse);
		
		USB keyBoard = new KeyBoard();
		l.useUSB(keyBoard);

	}

}


interface USB{
	 void open();
	 void close();
}

//鼠标类
class Mouse implements USB{

	@Override
	public void open() {
		System.out.println("打开鼠标");
	}

	@Override
	public void close() {
		System.out.println("关闭鼠标");
	}
	
	public void click(){
		System.out.println("点击鼠标");
	}
}

//键盘类
class KeyBoard implements USB{

	@Override
	public void open() {
		System.out.println("打开键盘");
		
	}

	@Override
	public void close() {
       System.out.println("关闭键盘");		
	}
	
	public void  pause(){
		System.out.println("敲击鼠标");
	}
}

//笔记本
class Laptop{
	// 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
	public void useUSB(USB usb){
		if (usb != null) {
			usb.open();
			if (usb instanceof Mouse) {
				Mouse mouse = (Mouse) usb;
				mouse.click();
			}
			
			if(usb instanceof KeyBoard){
				KeyBoard keyBoard = (KeyBoard) usb;
				keyBoard.pause();
			}
			usb.close();
		}
	}
}

