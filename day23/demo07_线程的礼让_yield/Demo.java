package com.itcast.demo07_�̵߳�����_yield;
/*
 * �̵߳����ã�public static void yield()����ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * �˷�������ǰ�߳��˻ص�"����"״̬����ζ��ͬ�������߳��ٴ�վ��ͬһ�������ϣ��ɲ���ϵͳ��������CPU��Դ��
 * Ҳ���п��ܻ�yield()֮�󣬻����ϱ����䵽CPUʱ�䡣
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
