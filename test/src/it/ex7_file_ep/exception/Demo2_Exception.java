package it.ex7_file_ep.exception;

public class Demo2_Exception {

	/**
	 * * A:异常处理的两种方式
			* a:try…catch…finally
				* try catch
				* try catch finally
				* try finally 
			* b:throws
		* B:try...catch处理异常的基本格式
			* try…catch…finally
		* C:案例演示
			* try...catch的方式处理1个异常
		
		try:用来检测异常的
		catch:用来捕获异常的
		finally:释放资源
		
		世界上最真情的相依就是你在try我在catch,无论你发神马脾气,我都静静接受,默默处理
		当通过trycatch将问题处理了,程序会继续执行
	 */
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(ArithmeticException a) {		//ArithmeticException a = new ArithmeticException();
			System.out.println("������,����Ϊ����");
		}
		
		System.out.println("1111111111111111");
	}

}

class Demo2 {
	/*
	 * ������
	 */
	public int div(int a,int b) {		//a = 10,b = 0
		return a / b;					// 10 / 0  ��������10,������0��������0��ʱ��Υ�����������㷨��,�׳��쳣
										//new ArithmeticException("/ by zero");
	}
} 
