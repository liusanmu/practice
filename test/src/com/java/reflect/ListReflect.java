package com.java.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**  
 * @Description:写一个ArrayList 的动态代理类
 * @author: liusen
 * @date:   2019年4月12日 下午2:41:52   
 */
public class ListReflect {

	public static void main(String[] args) {
		
		final List<String> list = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<String> proxyInstance = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(),
												list.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return method.invoke(list, args);
			}
		});
		
		proxyInstance.add("你好");
		System.out.println(list);
	}
}
