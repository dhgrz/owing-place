package com.itcast.demo02_死锁;
/*
 * 理解死锁的现象：此类实例说明：
 * 1.t1线程启动；
 * 2.t1运行run()方法
 * 3.t1锁定MyClass1对象；
 * 4.t1休眠1秒；
 * 5.t2线程启动；
 * 6.t2运行run()方法
 * 7.t2锁定MyClass2对象；
 * 8.t2休眠；
 * 9.t1醒来
 * 10.t1访问MyClass2的fun2()方法；
 * 	  	发现已被其它线程锁定，所以t1等待......
 * 11.t2醒来
 * 12.t2访问MyClass1的fun1()方法；
 * 		发现已被其它线程锁定，所以t2等待......
 * 13.此时，t1线程和t2线程都在等待，这就是：死锁；
 * 
 */
public class Demo {
	public static void main(String[] args) {
		MyClass1 c1 = new MyClass1();
		MyClass2 c2 = new MyClass2();
		MyThread1 t1 = new MyThread1(c1,c2);
		MyThread2 t2 = new MyThread2(c1,c2);
		t1.start();
		t2.start();
	}
}
