package com.java.designpattern.singleton;
/**  
 * @Description: LazySingleton.java
 * 存在线程安全漏洞，可以利用同步解决，但是效率会变低。内存方面符合了编程中的延迟加载思想。(在面试中面试官会比较希望答出这一点)
 * @author: liusen
 * @date:   2018年12月9日 下午5:47:34   
 */
public class LazySingleton {

	/* 持有私有静态实例，防止被引用，此处赋值为 null，目的是实现延迟加载 */
	private static LazySingleton instance = null;
	
	/* 私有构造方法，防止被实例化 */
	private LazySingleton(){}
	
	/* 静态工程方法，创建实例 */
	public static LazySingleton getInstance(){
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if(instance == null){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	
	
	//synchronized 关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用
	//getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
	/*public static synchronized LazySingleton getInstance1(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}*/
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve(){
		return instance;
		
	}
	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getInstance();
		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance == instance1 ? 1 : 0);
	}

}
