package com.itcast.demo02_死锁;
/*
 * 如果某个线程锁定MyClass2对象，那么其他线程不能访问这个对象中，任何被声明为synchronized的代码块或方法；
 */
public class MyClass2 {
	public synchronized void fun2(){
		System.out.println("MyClass2-->fun2()");
	}
}
