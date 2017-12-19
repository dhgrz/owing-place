package com.itcast.demo05_wait_sleep_yield区别;
/*
 * wait(),sleep(),yield()方法的区别：
 * 
 * wait():-->Object:被挂起时，释放锁；
 * 
 * sleep():-->Thread:休眠时，不释放锁；
 * 
 * yeild():-->Thread：暂停时，不释放锁；
 * 		
 */
public class Demo {
	public static void main(String[] args) {
		NumberPool pool  = new NumberPool();
		MyThread t1 = new MyThread(pool);
		MyThread t2 = new MyThread(pool);
		MyThread t3 = new MyThread(pool);
		t1.setName("线程1");
		t2.setName("线程2");
		t3.setName("线程3");
		t1.start();
		t2.start();
		t3.start();
		//测试wait()的唤醒
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pool.show2();*/
	}
}
