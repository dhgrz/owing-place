package com.itcast.demo07_JDK5ʵ���̵߳ķ�ʽCallable�ӿ�;

import java.util.concurrent.Callable;

public class MyCallable<V> implements Callable<V> {

	@Override
	public V call() throws Exception {
		for(int i = 0;i < 20 ;i++){
			System.out.println(Thread.currentThread().getName() + " ѭ�� = " + i);
		}
		return null;
	}

}
