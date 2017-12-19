package com.itcast.demo07_JDK5实现线程的方式Callable接口;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK5实现线程的方式：Callable接口
 * 
 * 步骤：
 * 1.实现Callable接口；
 * 2.重写call()方法
 * 
 * 测试：
 * 3.ExecutorService ser = Executors.newFixedThreadPool(int nThreads):
 * 4.ser.submit(new MyCallable());
 */
public class Demo {
	public static void main(String[] args) {
		ExecutorService ser = Executors.newFixedThreadPool(2);
		ser.submit(new MyCallable());
		//关闭
		ser.shutdown();
	}
}
