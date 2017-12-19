package com.itcast.demo02_����;

public class MyThread2 extends Thread{
	private MyClass1 cla1 = null;
	private MyClass2 cla2 = null;
	public MyThread2 (MyClass1 c1 , MyClass2 c2){
		this.cla1 = c1;
		this.cla2 = c2;
	}
	@Override
	public void run() {
		synchronized (cla2) {//����MyClass2����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cla1.fun1();	//����MyClass1��fun1()����
		}
	}
}
