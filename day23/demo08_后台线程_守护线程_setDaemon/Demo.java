package com.itcast.demo08_后台线程_守护线程_setDaemon;
/*
 * 默认情况下，当前进程开出的所有线程都是"非守护线程"：当主进程结束，会等待所有线程结束，应用程序才会结束；
 * 
 * 让开出的线程作为"守护线程"：Thread -->public final void setDaemon(boolean on):如果为true，为守护线程
 * 
 * 守护线程：当主进程结束时，所有的"守护线程"也会结束。(但不会立即结束，通常会有个小缓冲)
 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("兵1");
		t2.setName("兵2");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		//主进程是将军
		for(int i = 1 ;i <= 10;i++){
			System.out.println("将军杀敌：" + i);
		}
		System.out.println("将军杀敌结束，收工！！");
	}
}
