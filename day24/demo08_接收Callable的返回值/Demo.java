package com.itcast.demo08_����Callable�ķ���ֵ;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ��һ���߳�����͵Ĳ���
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.��ȡһ���̳߳�
		ExecutorService ser = Executors.newFixedThreadPool(2);
		//2.ִ���̣߳����շ���ֵ��<T> Future<T> submit(Callable<T> task)
		Future<Integer> result = ser.submit(new MyCallable(1000));
		//3.��ȡ�����
		Integer i;
		try {
			i = result.get();
			System.out.println("����1--1000���ۼӺͣ�" + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		ser.shutdown();
	}
}	
