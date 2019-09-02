package web.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: JdkAop.java
 * @author: liusen
 * @date: 2019年4月16日 上午9:23:28
 */
public class JdkAop {

	public static void main(String[] args) {
		ManSayHello mHello = new ManSayHello();
		AopHandle aHandle = new AopHandle(mHello);
		ISayHello i = (ISayHello) Proxy.newProxyInstance(
				ManSayHello.class.getClassLoader(),
				new Class[] { ISayHello.class }, aHandle);
		i.say();

	}

}

interface ISayHello {
	 String say();
}

class ManSayHello implements ISayHello {

	@Override
	public String say() {
		System.out.println("Hello World!");
		return "MAN";
	}

}

class AopHandle implements InvocationHandler {

	private Object obj1;

	public AopHandle(Object obj) {
		this.obj1 = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("前置代理");
		// 反射调用方法
		Object invoke = method.invoke(obj1, args);

		System.out.println("后置代理");
		return invoke;
	}

}
/*
 * /////// public class SayHello { public void say(){
 * System.out.println("hello world!"); } }
 * 
 * ///////////////////////// public class CglibProxy implements
 * MethodInterceptor { private Enhancer enhancer = new Enhancer(); public Object
 * getProxy(Class clazz){ enhancer.setSuperclass(clazz);
 * enhancer.setCallback(this); return enhancer.create(); }
 * 
 * @Override public Object intercept(Object o, Method method, Object[] objects,
 * MethodProxy methodProxy) throws Throwable { System.out.println("前置代理");
 * //通过代理类调用父类中的方法 Object result = methodProxy.invokeSuper(o, objects);
 * 
 * System.out.println("后置代理"); return result; } }
 * 
 * //////////////////////////// public class Main { public static void
 * main(String[] args) { CglibProxy proxy = new CglibProxy(); //通过生成子类的方式创建代理类
 * SayHello proxyImp = (SayHello)proxy.getProxy(SayHello.class); proxyImp.say();
 * } }
 */
