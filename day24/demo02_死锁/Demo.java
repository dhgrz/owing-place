package com.itcast.demo02_����;
/*
 * ������������󣺴���ʵ��˵����
 * 1.t1�߳�������
 * 2.t1����run()����
 * 3.t1����MyClass1����
 * 4.t1����1�룻
 * 5.t2�߳�������
 * 6.t2����run()����
 * 7.t2����MyClass2����
 * 8.t2���ߣ�
 * 9.t1����
 * 10.t1����MyClass2��fun2()������
 * 	  	�����ѱ������߳�����������t1�ȴ�......
 * 11.t2����
 * 12.t2����MyClass1��fun1()������
 * 		�����ѱ������߳�����������t2�ȴ�......
 * 13.��ʱ��t1�̺߳�t2�̶߳��ڵȴ�������ǣ�������
 * 
 */
public class Demo {
	public static void main(String[] args) {
		MyClass1 c1 = new MyClass1();
		MyClass2 c2 = new MyClass2();
		MyThread1 t1 = new MyThread1(c1,c2);
		MyThread2 t2 = new MyThread2(c1,c2);
		t1.start();
		t2.start();
	}
}
