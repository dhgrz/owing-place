package com.itcast.demo04_�߳����ȼ�;
/*
 * �߳����ȼ���
 * 1.������߳�ͬʱ��������ʱ�������������ǵ����ȼ���
 * 2.���нϸ����ȼ����̣߳����ܻᱻ����ϵͳ��������ִ�л��ᣬ���ܻ�����ִ����ϣ�
 * 3.�̵߳�Ĭ�����ȼ���5
 * 4.Java�У��̵߳����ȼ�����1-10���ӵ͵���
 * 5.ע�⣺��Ҳ�Ҫ������"���ȼ�"ȥ��ͼ��ĳ���߳������깤������Ϊ�̵߳����ȼ����ɲ���ϵͳȥ�����ͷ��䣬
 *   ����ϵͳ���ᱣ֤���и����ȼ��Ļ�һ����ִ����ϡ�
 *   ����߳̾��нϸ����ȼ��Ļ��и���Ļ�����ִ�еĻ��ᣬ��Ҳ�����̴߳���Ƚϸ��ӵ�ҵ�������£����
 *   �߳��ڵ�����ܼ򵥣����ܾͿ�����Ч����
 */
public class Demo {
	public static void main(String[] args) {
		//����6���߳�
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();
		MyThread t6 = new MyThread();
		
		t1.setName("�߳�1");
		t2.setName("�߳�2");
		t3.setName("�߳�3");
		t4.setName("�߳�4");
		t5.setName("�߳�5");
		t6.setName("�߳�6");
		
		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(1);
		t4.setPriority(1);
		t5.setPriority(1);
		t6.setPriority(10);//��ߵ����ȼ���
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}
}
