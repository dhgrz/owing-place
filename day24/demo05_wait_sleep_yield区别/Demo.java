package com.itcast.demo05_wait_sleep_yield����;
/*
 * wait(),sleep(),yield()����������
 * 
 * wait():-->Object:������ʱ���ͷ�����
 * 
 * sleep():-->Thread:����ʱ�����ͷ�����
 * 
 * yeild():-->Thread����ͣʱ�����ͷ�����
 * 		
 */
public class Demo {
	public static void main(String[] args) {
		NumberPool pool  = new NumberPool();
		MyThread t1 = new MyThread(pool);
		MyThread t2 = new MyThread(pool);
		MyThread t3 = new MyThread(pool);
		t1.setName("�߳�1");
		t2.setName("�߳�2");
		t3.setName("�߳�3");
		t1.start();
		t2.start();
		t3.start();
		//����wait()�Ļ���
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pool.show2();*/
	}
}
