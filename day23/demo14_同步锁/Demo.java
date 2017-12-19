package com.itcast.demo14_同步锁;
/*
 * 说明见"Accound类"
 */
public class Demo {
	public static void main(String[] args) {
		Accound acc = new Accound();//0x2233
		
		MyThread t1 = new MyThread(acc,"存");
		MyThread t2 = new MyThread(acc,"取");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("最终余额：" + acc.getBalance());
	}
}
