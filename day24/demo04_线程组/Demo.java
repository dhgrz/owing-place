package com.itcast.demo04_�߳���;
/*
 * �߳��飺�ô�������һ������һ�����ڵ������߳���ͳһ���趨�������ȽϷ��㣻
 * 
 * Thread��
 * 	���췽����
 * 		Thread(ThreadGroup group, String name) �����µ� Thread ����
 * 		������������ThreadGroup�����Ĺ��췽���������ã�
 * 	��Ա������
 * 		ThreadGroup  grp = getThreadGroup();
 * 		Ĭ������£���ȡ��������main��
 * 
 * ThreadGroup�ࣺ�߳���
 * 	���췽����
 * 		ThreadGroup(String name) :����һ�����߳��顣 
		ThreadGroup(ThreadGroup parent, String name)������һ�����߳��顣 
 * 	��Ա������
 * 		String getName();
 */
public class Demo {
	public static void main(String[] args) {
		//��ȡĬ�ϵ�����
		/*MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		ThreadGroup grp = t1.getThreadGroup();
		ThreadGroup grp2 = t2.getThreadGroup();
		//
		System.out.println(grp.getName());
		System.out.println(grp2.getName());*/
		setGroup();
		//1.��ʵ����һ�������
				ThreadGroup group1 = new ThreadGroup("�ҵ��߳���");
				//2.�������̼߳���һ���飿
				MyThread t1 = new MyThread(group1,"�߳�1");
				MyThread t2 = new MyThread(group1,"�߳�2");
				/*//3.����
				t1.start();
				t2.start();*/
				//���Զ����ڵ������̣߳���ͳһ������
				//���߳����ڵ������߳���Ϊ"�ػ��߳�"
				group1.setDaemon(true);
				t1.start();
				t2.start();
	}
	//��һЩ�߳̽��з���
	public static void setGroup(){
	}
}
