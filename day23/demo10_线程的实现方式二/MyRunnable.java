package com.itcast.demo10_线程的实现方式二;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}

}
