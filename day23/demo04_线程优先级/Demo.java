package com.itcast.demo04_线程优先级;
/*
 * 线程优先级：
 * 1.当多个线程同时并行运行时，可以设置它们的优先级。
 * 2.具有较高优先级的线程，可能会被操作系统分配更多的执行机会，可能会更早的执行完毕；
 * 3.线程的默认优先级：5
 * 4.Java中，线程的优先级级别：1-10：从低到高
 * 5.注意：大家不要依赖于"优先级"去试图让某个线程先做完工作。因为线程的优先级是由操作系统去决定和分配，
 *   操作系统不会保证具有高优先级的会一定先执行完毕。
 *   多个线程具有较高优先级的会有更多的机会获得执行的机会，这也是在线程处理比较复杂的业务的情况下，如果
 *   线程内的任务很简单，可能就看不到效果；
 */
public class Demo {
	public static void main(String[] args) {
		//启动6个线程
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();
		MyThread t6 = new MyThread();
		
		t1.setName("线程1");
		t2.setName("线程2");
		t3.setName("线程3");
		t4.setName("线程4");
		t5.setName("线程5");
		t6.setName("线程6");
		
		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(1);
		t4.setPriority(1);
		t5.setPriority(1);
		t6.setPriority(10);//最高的优先级；
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}
}
