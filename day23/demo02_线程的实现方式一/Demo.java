package com.itcast.demo02_�̵߳�ʵ�ַ�ʽһ;
/*
 * �̵߳�ʵ�ַ�ʽһ��
 * ���裺
 * 1.����һ���࣬�̳���java.lang.Thread
 * 2.��д�����run()������
 * 3.�ڲ������У�ʵ�����Զ�����Ķ��󣬲���������start()����������һ���̣߳�
 * 
 * �̵߳�ʵ�ַ�ʽ����
 * ���裺
 * 1.����һ���࣬ʵ��Runnable�ӿڣ�
 * 2.��д�����run()������
 * 3.�ڲ������У�
 * 	 1).ʵ�����Զ�����Ķ���
 *   2).Thread t = new Thread(�Զ������������);
 *      t.start();
 *      �򻯵�д����
 *      new Thread(�Զ������������).start();
 */
public class Demo {
	public static void main(String[] args) {
		//3.�ڲ������У�ʵ�����Զ�����Ķ��󣬲���������start()����������һ���̣߳�
		MyThread t = new MyThread();
		t.start();//�����̣߳���ִ��run()����
	//	t.run();//��ͨ�ķ������ã���������Ϊһ���߳�������
	//	t.start();//����ͬһ���̶߳��󣬲��ܶ�ε�start();�쳣��IllegalThreadStateException
		for(int j = 0;j < 20 ;j++){
			System.out.println("j = " + j);
		}
		System.out.println("��ǰmain()���� ���߳����ƣ�" + Thread.currentThread().getName());
		System.out.println("main����ִ����ϣ�");
	}
}
