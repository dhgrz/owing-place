package com.itcast.demo06_�̼߳���_join;
/*
 * �̵߳ļ��룺Thread --> public final void join():�ȴ����߳���ֹ�� 

 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("��1");
		t2.setName("��2");
		
		t1.start();
		//������t1�ȳ壬��ȥɱ�У���ɱ�꣬����ɱ
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
