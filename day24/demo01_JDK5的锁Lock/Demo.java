package com.itcast.demo01_JDK5����Lock;
/*
 * ���Ӽ���Accound����
 * 
 * ʹ��JDK5֮���Lock:
 * 
 * 1.Lock��һ���ӿڣ�
 * 		1).lock();//����
 * 		2).unlock();//����
 * 
 * 2.ʹ�����ࣺReentrantLock
 * 3.ʹ�÷�ʽ��
 * 		Lock lock = new ReentrantLock();
 * 		lock.lock();//������
 * 		try{
 * 			//ͬ��ִ�еĴ��룻
 * 		}finally{
 * 			lock.unlock();//��Ϊ���������������Ϊ�˷�ֹ��������쳣��������û�ܽ�������������ʹ�ã�������������try�У�������finally��
 * 		}
 */
public class Demo {
	public static void main(String[] args) {
		Accound acc = new Accound();
		MyThread t1 = new MyThread(acc,"��");
		MyThread t2 = new MyThread(acc,"ȡ");
		t1.start();
		t2.start();
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������" + acc.getBalance());
	}
}
