package com.itcast.demo11_Thread��ʽʵ����Ʊ;
/*
 * ��Ҫ�����ࣺ
 * 1.Ʊ�أ�TicketPool
 * 2.��Ʊ�߳��ࣺSellTicketThread
 * 3.�����ࣺDemo
 * 
 * ע�⣺�����漰��һ��"���̵߳Ĳ���������"���ں�������
 * ������߳�ͬʱ����һ��������Դʱ���ᵼ�����ݵĲ�һ�¡�
 */
public class Demo {
	public static void main(String[] args) {
		//1.��ʵ����һ��Ʊ�ض���
		TicketPool pool  = new TicketPool();
		//2.ʵ���������̡߳���һ��pool���󴫸�����Thread��ʹ����Thread����һ������
		SellTicketThread t1 = new SellTicketThread(pool);
		SellTicketThread t2 = new SellTicketThread(pool);
		SellTicketThread t3 = new SellTicketThread(pool);
		
		t1.setName("����1");
		t2.setName("����2");
		t3.setName("����3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
