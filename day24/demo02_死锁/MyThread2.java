package com.itcast.demo02_死锁;

public class MyThread2 extends Thread{
	private MyClass1 cla1 = null;
	private MyClass2 cla2 = null;
	public MyThread2 (MyClass1 c1 , MyClass2 c2){
		this.cla1 = c1;
		this.cla2 = c2;
	}
	@Override
	public void run() {
		synchronized (cla2) {//锁定MyClass2对象
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cla1.fun1();	//访问MyClass1的fun1()方法
		}
	}
}
