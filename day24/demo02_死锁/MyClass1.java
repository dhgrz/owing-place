package com.itcast.demo02_死锁;
/*
 * 如果某个线程锁定MyClass1对象，那么其他线程不能访问这个对象中，任何被声明为synchronized的代码块或方法；
 */
public class MyClass1 {
	public synchronized void fun1(){
		System.out.println("MyClass1-->fun1()");
	}
}
