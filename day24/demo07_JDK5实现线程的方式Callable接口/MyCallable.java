package com.itcast.demo07_JDK5实现线程的方式Callable接口;

import java.util.concurrent.Callable;

public class MyCallable<V> implements Callable<V> {

	@Override
	public V call() throws Exception {
		for(int i = 0;i < 20 ;i++){
			System.out.println(Thread.currentThread().getName() + " 循环 = " + i);
		}
		return null;
	}

}
