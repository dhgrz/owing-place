package com.itcast.demo08_��̨�߳�_�ػ��߳�_setDaemon;
/*
 * Ĭ������£���ǰ���̿����������̶߳���"���ػ��߳�"���������̽�������ȴ������߳̽�����Ӧ�ó���Ż������
 * 
 * �ÿ������߳���Ϊ"�ػ��߳�"��Thread -->public final void setDaemon(boolean on):���Ϊtrue��Ϊ�ػ��߳�
 * 
 * �ػ��̣߳��������̽���ʱ�����е�"�ػ��߳�"Ҳ�������(����������������ͨ�����и�С����)
 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("��1");
		t2.setName("��2");
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		//�������ǽ���
		for(int i = 1 ;i <= 10;i++){
			System.out.println("����ɱ�У�" + i);
		}
		System.out.println("����ɱ�н������չ�����");
	}
}
