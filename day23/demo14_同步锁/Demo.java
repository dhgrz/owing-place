package com.itcast.demo14_ͬ����;
/*
 * ˵����"Accound��"
 */
public class Demo {
	public static void main(String[] args) {
		Accound acc = new Accound();//0x2233
		
		MyThread t1 = new MyThread(acc,"��");
		MyThread t2 = new MyThread(acc,"ȡ");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������" + acc.getBalance());
	}
}
