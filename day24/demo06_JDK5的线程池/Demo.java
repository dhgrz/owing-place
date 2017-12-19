package com.itcast.demo06_JDK5的线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK1.5新增了一个Executors类，此类包含了一些静态方法：
 * 	public static ExecutorService newCachedThreadPool()：创建一个可根据需要创建新线程的线程池，
	public static ExecutorService newFixedThreadPool(int nThreads)：创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
	public static ExecutorService newSingleThreadExecutor()：创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。

	返回值：ExecutorSeriver
		方法：
			Future<?> submit(Runnable task)
			<T> Future<T> submit(Callable<T> task)

 */
public class Demo {
	public static void main(String[] args) {
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		MyRunnable r1 = new MyRunnable();//需要5秒
		MyRunnable r2 = new MyRunnable();//需要5秒
		
		ser.submit(r1);
		ser.submit(r2);
		
		//线程池的效果，当再次需要运行着两个线程时：
		
		try {
			System.out.println("主进程休眠5秒......");
			Thread.sleep(1000 * 5);//为了确保两个线程执行完毕
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//需要再次执行这两个线程；
		//之前我们的例子实现的方式，那么在这里必须再次实例化两个对象，还需要10秒
		//这里，直接使用线程池去启动
		ser.submit(r1);
		ser.submit(r2);
		
		ser.submit(r1);
		ser.submit(r2);
		
		ser.shutdown();
		
	}
}
