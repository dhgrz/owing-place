package com.itcast.demo09_ֹͣ�߳�_interrupt;
/*
 * ֹͣ�̣߳�
 * 	public final void stop()��
	public void interrupt()��

 */
public class Demo {
	public static void main(String[] args) {
		//����MyThread,MyThread�е�run��ִ��20�룬���ǿ������������У���
		//MyThreadִ��3������û��ֹͣ����ô��ǿ��ֹͣ��
		MyThread t = new MyThread();
		t.start();
		
		/*try {
			Thread.sleep(1000 * 3);//�ȴ�3�룬MyThread��ִ��3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//ǿ��ȥֹͣMyThread
	//	t.stop();//ֹͣ�̣߳����˷����ѹ�ʱ��
		t.interrupt();//stop���滻������ȥʹMyThread��run()�׳�һ���쳣�����쳣�У�����ȥ�����߳�ִ�У�
		
	}
}
