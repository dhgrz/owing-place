package com.itcast.demo03_��ȡ�������̵߳�����;
/*
 * ��ȡ�������̵߳����ƣ�
 * 
 * 1.һ���߳��࣬����ʵ�����������ÿ�����󶼿�����Ϊһ���������߳�ȥ���У�
 * 2.һ��Thread������������߳����ƣ���ȡ�߳����ƣ�
 *   Ĭ���߳����ƣ�Thread + ��� �� ��Ŵ�0��ʼ����һ�������ı��Ϊ0��
 *   setName�����߳����ƣ�
 *   getName��ȡ�߳����ƣ�
 * 
 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("�˳�");
		t2.setName("��ٳ");
		
		t1.start();
		t2.start();
	}
}
