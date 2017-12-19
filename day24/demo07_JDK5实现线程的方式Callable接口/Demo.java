package com.itcast.demo07_JDK5ʵ���̵߳ķ�ʽCallable�ӿ�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK5ʵ���̵߳ķ�ʽ��Callable�ӿ�
 * 
 * ���裺
 * 1.ʵ��Callable�ӿڣ�
 * 2.��дcall()����
 * 
 * ���ԣ�
 * 3.ExecutorService ser = Executors.newFixedThreadPool(int nThreads):
 * 4.ser.submit(new MyCallable());
 */
public class Demo {
	public static void main(String[] args) {
		ExecutorService ser = Executors.newFixedThreadPool(2);
		ser.submit(new MyCallable());
		//�ر�
		ser.shutdown();
	}
}
