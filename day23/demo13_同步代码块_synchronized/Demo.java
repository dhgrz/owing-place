package com.itcast.demo13_ͬ�������_synchronized;
/*
 * ͬ������飬������̻߳����µĲ������⣺
 * 
 * ���⣺
 * 	1.�Ƿ��Ƕ��̻߳���
	2.�Ƿ��й�������
	3.�Ƿ��ж�����������������

   ����������ܻᱻ����̷߳��ʵĴ������"ͬ��"ʹ�ùؼ��֣�synchronized
   �﷨��synchronized(theObject){
   		//���ܻᱻ����̷߳��ʵĴ���
   	 }
   	 theObject:��һ�����󣬶�������Ķ��󡣱�ʾ�����ҷ�����������ĳ��ͬ�������ʱ��
   	 �������̲߳��ܷ�����������ͬ��������ͬ������顣
   	 
   	 synchronized:
   	 �ô��������ڶ��̻߳����±�ð�ȫ�����ݱ�ÿɿ���
   	 �׶ˣ������ڲ����˺ܶ��߳̿��Ʒ���Ĺ���������Ч�ʵ͡�
 */
public class Demo {
	public static void main(String[] args) {
		TicketPool pool = new TicketPool();
		
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
