package com.itcast.demo05_wait_sleep_yield����;
public class NumberPool {
	/*
	 * �˷������ܻᱻ���̷߳���
	 */
	public synchronized void show(String threadName){//1.�߳�1����-->���� 3.�߳�3����
		//****����wait()****************//
		/*System.out.println(threadName + " ��ʼ�ȴ�......");
		try {
			this.wait();//2.�߳�1�������ͷ���
			System.out.println(threadName + " �����ѣ�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//****************************//
		//******����sleep()************//
		/*System.out.println(threadName + " ��ʼ����2��......");
		try {
			Thread.sleep(1000 * 2);
			System.out.println(threadName + " ���߽���������!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//*******����yield()**********//
		System.out.println(threadName + " ����ͣ......");
		Thread.yield();
		System.out.println(threadName + " ��ͣ�������ָ����С�");
	}
	public synchronized void show2(){
		try {
			Thread.sleep(1000 * 2);
			this.notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
