package com.itcast.demo02_死锁;
public class MyThread1 extends Thread{
	private MyClass1 cla1 = null;
	private MyClass2 cla2 = null;
	public MyThread1 (MyClass1 c1 , MyClass2 c2){
		this.cla1 = c1;
		this.cla2 = c2;
	}
	@Override
	public void run() {
		synchronized (cla1) {//锁定MyClass1对象
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cla2.fun2();	//访问MyClass2的fun2()方法
		}
	}
}
