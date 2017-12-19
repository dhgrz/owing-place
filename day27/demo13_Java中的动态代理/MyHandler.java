package com.itcast.demo13_Java中的动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private Object target;
	public MyHandler(Object target){
		this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		check();
		//通过反射机制调用对象的方法
		Object obj = method.invoke(target, args);
		zj();
		
		return obj;
	}
	public boolean check(){
		System.out.println("先期审核......");
		return true;
	}
	public void zj(){
		System.out.println("后期总结......");
	}

}
