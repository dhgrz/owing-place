package com.itcast.demo13_Java中的动态代理;

import java.lang.reflect.Proxy;

/*
 * 实现动态代理：
 * 步骤：
 * 1.实现一个接口：InvocationHandler；-->它负责去调用我们希望调用的方法，并在之前，或之后去做一些其它的额外的事情
 * 2.Proxy.newProxyInstance()方法，获取一个代理的实例
 */
public class Demo {
	public static void main(String[] args) {

		IStudent stu = (IStudent) Proxy.newProxyInstance(
				Student.class.getClassLoader(), Student.class.getInterfaces(),
				new MyHandler(new Student())); // 获取了一个Student的代理对象
		stu.coding();

		IDog dog = (IDog) Proxy.newProxyInstance(Dog.class.getClassLoader(),
				Dog.class.getInterfaces(), new MyHandler(new Dog()));
		dog.eat();
	}
}
