package com.itcast.demo05_wait_sleep_yield区别;
public class NumberPool {
	/*
	 * 此方法可能会被多线程访问
	 */
	public synchronized void show(String threadName){//1.线程1进入-->加锁 3.线程3进入
		//****测试wait()****************//
		/*System.out.println(threadName + " 开始等待......");
		try {
			this.wait();//2.线程1被挂起。释放锁
			System.out.println(threadName + " 被唤醒！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//****************************//
		//******测试sleep()************//
		/*System.out.println(threadName + " 开始休眠2秒......");
		try {
			Thread.sleep(1000 * 2);
			System.out.println(threadName + " 休眠结束，醒来!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//*******测试yield()**********//
		System.out.println(threadName + " 被暂停......");
		Thread.yield();
		System.out.println(threadName + " 暂停结束，恢复运行。");
	}
	public synchronized void show2(){
		try {
			Thread.sleep(1000 * 2);
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
