package it.ex7_file_ep.exception;

public class Demo5_Throwable {

	/**
	 * * A:Throwable的几个常见方法
			* a:getMessage()
				* 获取异常信息，返回字符串。
			* b:toString()
				* 获取异常类名和异常信息，返回字符串。
			* c:printStackTrace()
				* 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
		* B:案例演示
			* Throwable的几个常见方法的基本使用
	 */
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {			//Exception e = new ArithmeticException("/ by zero");
			//System.out.println(e.getMessage());		//��ȡ�쳣��Ϣ
			//System.out.println(e); 		//����toString����,��ӡ�쳣������쳣��Ϣ
			e.printStackTrace();		//jvmĬ�Ͼ������ַ�ʽ�����쳣
		}
	}

}
