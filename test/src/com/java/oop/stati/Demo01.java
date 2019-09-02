package com.java.oop.stati;
/**  
 * @Description: Demo01.java
 * @author: liusen
 * @date:   2019年3月20日 下午2:49:10   
 * @version V2.0
 */
public class Demo01 {
	/*静态方法可以直接访问类变量和静态方法。
	静态方法 不能直接访问普通成员变量或成员方法。反之，成员方法可以直接访问类变量或静态方法。
	静态方法中，不能使用 this关键字。*/
	private int no;
	private String name;

	static Integer age = 10;
	
	public static void name() {
		//test();
		/**
		 * // 定义int 数组
			  int[] arr  =  {2,34,35,4,657,8,69,9};
			  // 打印数组,输出地址值
			  System.out.println(arr); // [I@2ac1fdc4
			  // 数组内容转为字符串
			  String s = Arrays.toString(arr);
			  // 打印字符串,输出内容
			  System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
			
			
			   // 定义int 数组
               int[] arr  =  {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
               System.out.println("排序前:"+ Arrays.toString(arr)); 
			   // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6,2]
 			   // 升序排序
 			   Arrays.sort(arr);
  			   System.out.println("排序后:"+ Arrays.toString(arr));
              // 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46,48]
                
            子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），会出现覆盖效
果，也称为重写或者复写。声明不变，重新实现。
		 */
		
	}
	
	public void test() {
		age=20;
		name();
	}
	

	public static void main(String[] args) {
		
	}

	
}
