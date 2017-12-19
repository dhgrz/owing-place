package com.itcast.demo12_多线程常见面试题;
/*
 * 	一.多线程有几种实现方案，分别是哪几种?三种：
 * 	1.继承Thread,重写run()
 * 	2.实现Runnable接口，实现：run()方法：
 * 	3.JDK5提供：实现Callable接口，实现：call()方法；
 * 
	二.同步有几种方式，分别是什么?
	1.同步代码块：synchronized(需要加锁的对象){//加锁的代码块}
	2.同步方法：public synchronized void show(){}
	  静态方法可以同步么？
	  	可以。
	  静态方法内部，使用同步代码块，锁对象是什么？
	  	public static void show(){
	  		synchronized(类名.class){//在静态方法里不能使用this关键字，所以这里不能使用this
	  		}
	  	}
	三.启动一个线程是run()还是start()?它们的区别?
		start():启动线程；
		run()方法是线程中需要做事情的代码写在run()方法中，它会由start()方法去自动调用；
	四：sleep()和wait()方法的区别：
		sleep:Thread的方法。带参数，必须指定时间。唤醒，是时间到了，会自动醒来。用在同步代码块或同步方法中时，不释放锁
		wait（）:Object的方法。可以带参数，可以不带参数。如果没指定时间，由notify/notifyAll唤醒。如果带时间，时间到了自己醒来。用在同步方法或同步代码中，会释放锁。
	五:为什么wait(),notify(),notifyAll()等方法都定义在Object类中
		任何对象都有可能被多线程访问，也有权利让其他线程等待，也必须有权利唤醒其他线程。所以定义在Object类中。
	六：线程的生命周期图

 */
public class Demo {

}
