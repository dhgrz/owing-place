package com.itcast.demo13_同步代码块_synchronized;
/*
 * 同步代码块，解决多线程环境下的并发问题：
 * 
 * 问题：
 * 	1.是否是多线程环境
	2.是否有共享数据
	3.是否有多条语句操作共享数据

   解决：将可能会被多个线程访问的代码进行"同步"使用关键字：synchronized
   语法：synchronized(theObject){
   		//可能会被多个线程访问的代码
   	 }
   	 theObject:是一个对象，对其加锁的对象。表示，当我访问这个对象的某个同步代码块时，
   	 其它的线程不能访问这个对象的同步方法或同步代码块。
   	 
   	 synchronized:
   	 好处：代码在多线程环境下变得安全，数据变得可靠；
   	 弊端：由于内部做了很多线程控制方面的工作，所以效率低。
 */
public class Demo {
	public static void main(String[] args) {
		TicketPool pool = new TicketPool();
		
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
