package com.itcast.demo13_Java�еĶ�̬����;

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
		//ͨ��������Ƶ��ö���ķ���
		Object obj = method.invoke(target, args);
		zj();
		
		return obj;
	}
	public boolean check(){
		System.out.println("�������......");
		return true;
	}
	public void zj(){
		System.out.println("�����ܽ�......");
	}

}
