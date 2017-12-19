package com.itcast.demo01_JDK5的锁Lock;
/*
 * 例子见：Accound类中
 * 
 * 使用JDK5之后的Lock:
 * 
 * 1.Lock是一个接口：
 * 		1).lock();//加锁
 * 		2).unlock();//解锁
 * 
 * 2.使用子类：ReentrantLock
 * 3.使用方式：
 * 		Lock lock = new ReentrantLock();
 * 		lock.lock();//加锁：
 * 		try{
 * 			//同步执行的代码；
 * 		}finally{
 * 			lock.unlock();//因为我们来处理解锁，为了防止代码出现异常，而导致没能解锁，所以这里使用：将代码块包含在try中，解锁在finally中
 * 		}
 */
public class Demo {
	public static void main(String[] args) {
		Accound acc = new Accound();
		MyThread t1 = new MyThread(acc,"存");
		MyThread t2 = new MyThread(acc,"取");
		t1.start();
		t2.start();
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("最终余额：" + acc.getBalance());
	}
}
