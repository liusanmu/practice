package web.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: JdkAop2.java
 * @author: liusen
 * @date: 2019年4月16日 上午10:46:31
 */
public class JdkAop2 {
	public static void main(String[] args) {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
	

}

// target：目标方法
interface UserService {

	void addUser();

	void updateUser();

	void deleteUser();

}


// 切面类
class MyAspect {
	// Advice(通知/增强):
	public void before() {
		System.out.println("鸡首");
	}

	public void after() {
		System.out.println("牛后");
	}

}


class MyBeanFactory{
	
	public static UserService createService(){

		//1 目标类
		final UserService userService = new UserServiceImpl();
		//2切面类
		final MyAspect myAspect = new MyAspect();
		
		UserService proxService = (UserService)Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				myAspect.before();
				
				Object obj = method.invoke(userService, args);
				
				myAspect.after();
				
				return obj;
			}
		});
		
		
		return proxService;
	}


}
class UserServiceImpl implements UserService{

	@Override
	public void addUser() {
		System.out.println("addUser");
	}

	@Override
	public void updateUser() {
		System.out.println("updateUser");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("deleteUser");
		
	}
	
}


/**cglib
 * 
 *
 * 没有接口，只有实现类。
采用字节码增强框架 cglib，在运行时 创建目标类的子类，从而对目标类进行增强

 * 
 * public class MyBeanFactory {
	
	public static UserServiceImpl createService(){
		//1 目标类
		final UserServiceImpl userService = new UserServiceImpl();
		//2切面类
		final MyAspect myAspect = new MyAspect();
		// 3.代理类 ，采用cglib，底层创建目标类的子类
		//3.1 核心类
		Enhancer enhancer = new Enhancer();
		//3.2 确定父类
		enhancer.setSuperclass(userService.getClass());
		/* 3.3 设置回调函数 , MethodInterceptor接口 等效 jdk InvocationHandler接口
		 * 	intercept() 等效 jdk  invoke()
		 * 		参数1、参数2、参数3：以invoke一样
		 * 		参数4：methodProxy 方法的代理
		
		enhancer.setCallback(new MethodInterceptor(){

			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				
				//前
				myAspect.before();
				
				//执行目标类的方法
				Object obj = method.invoke(userService, args);
				// * 执行代理类的父类 ，执行目标类 （目标类和代理类 父子关系）
				methodProxy.invokeSuper(proxy, args);
				
				//后
				myAspect.after();
				
				return obj;
			}
		});
		//3.4 创建代理
		UserServiceImpl proxService = (UserServiceImpl) enhancer.create();
		
		return proxService;
	}

}

 */