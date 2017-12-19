package com.itcast.demo02_线程的实现方式一;
/*
 * 线程的实现方式一：
 * 步骤：
 * 1.定义一个类，继承自java.lang.Thread
 * 2.重写里面的run()方法；
 * 3.在测试类中，实例化自定义类的对象，并调用它的start()方法，启动一个线程；
 * 
 * 线程的实现方式二：
 * 步骤：
 * 1.定义一个类，实现Runnable接口；
 * 2.重写里面的run()方法；
 * 3.在测试类中：
 * 	 1).实例化自定义类的对象；
 *   2).Thread t = new Thread(自定义类对象引用);
 *      t.start();
 *      简化的写法：
 *      new Thread(自定义类对象引用).start();
 */
public class Demo {
	public static void main(String[] args) {
		//3.在测试类中，实例化自定义类的对象，并调用它的start()方法，启动一个线程；
		MyThread t = new MyThread();
		t.start();//启动线程，会执行run()方法
	//	t.run();//普通的方法调用，并不能作为一个线程启动。
	//	t.start();//对于同一个线程对象，不能多次的start();异常：IllegalThreadStateException
		for(int j = 0;j < 20 ;j++){
			System.out.println("j = " + j);
		}
		System.out.println("当前main()方法 的线程名称：" + Thread.currentThread().getName());
		System.out.println("main方法执行完毕！");
	}
}
