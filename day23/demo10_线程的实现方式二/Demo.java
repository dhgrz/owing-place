package com.itcast.demo10_�̵߳�ʵ�ַ�ʽ��;
/*
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
		//3.1.ʵ����
		MyRunnable myRun = new MyRunnable();
		//3.2
		/*Thread t1 = new Thread(myRun,"�˳�");
		Thread t2 = new Thread(myRun,"��ٳ");
		//�����߳�
		t1.start();
		t2.start();*/
		//��д��
		new Thread(myRun,"�˳�").start();
		new Thread(myRun,"��ٳ").start();
	}
}
