package com.itcast.demo06_线程加入_join;
/*
 * 线程的加入：Thread --> public final void join():等待该线程终止。 

 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("兵1");
		t2.setName("兵2");
		
		t1.start();
		//可以让t1先冲，先去杀敌，你杀完，我再杀
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
