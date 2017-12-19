package com.itcast.demo08_接收Callable的返回值;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 让一个线程做求和的操作
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.获取一个线程池
		ExecutorService ser = Executors.newFixedThreadPool(2);
		//2.执行线程，接收返回值：<T> Future<T> submit(Callable<T> task)
		Future<Integer> result = ser.submit(new MyCallable(1000));
		//3.获取结果：
		Integer i;
		try {
			i = result.get();
			System.out.println("计算1--1000的累加和：" + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		ser.shutdown();
	}
}	
