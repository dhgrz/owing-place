package com.itcast.demo10_线程的实现方式二;
/*
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
		//3.1.实例化
		MyRunnable myRun = new MyRunnable();
		//3.2
		/*Thread t1 = new Thread(myRun,"邓超");
		Thread t2 = new Thread(myRun,"孙俪");
		//启动线程
		t1.start();
		t2.start();*/
		//简化写法
		new Thread(myRun,"邓超").start();
		new Thread(myRun,"孙俪").start();
	}
}
