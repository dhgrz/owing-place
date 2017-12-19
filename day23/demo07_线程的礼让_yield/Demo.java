package com.itcast.demo07_线程的礼让_yield;
/*
 * 线程的礼让：public static void yield()：暂停当前正在执行的线程对象，并执行其他线程。 
 * 此方法将当前线程退回到"就绪"状态，意味着同其他的线程再次站在同一起跑线上，由操作系统决定分配CPU资源，
 * 也很有可能会yield()之后，会马上被分配到CPU时间。
 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("邓超");
		t2.setName("孙俪");
		
		t1.start();
		t2.start();
	}
}
