package com.itcast.demo11_Thread方式实现卖票;
/*
 * 需要三个类：
 * 1.票池：TicketPool
 * 2.卖票线程类：SellTicketThread
 * 3.测试类：Demo
 * 
 * 注意：此例涉及到一个"多线程的并发性问题"，在后面解决。
 * 当多个线程同时访问一个共享资源时，会导致数据的不一致。
 */
public class Demo {
	public static void main(String[] args) {
		//1.先实例化一个票池对象
		TicketPool pool  = new TicketPool();
		//2.实例化三个线程。将一个pool对象传给三个Thread，使三个Thread共享一个对象
		SellTicketThread t1 = new SellTicketThread(pool);
		SellTicketThread t2 = new SellTicketThread(pool);
		SellTicketThread t3 = new SellTicketThread(pool);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
