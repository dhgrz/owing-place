package com.itcast.demo06_JDK5���̳߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK1.5������һ��Executors�࣬���������һЩ��̬������
 * 	public static ExecutorService newCachedThreadPool()������һ���ɸ�����Ҫ�������̵߳��̳߳أ�
	public static ExecutorService newFixedThreadPool(int nThreads)������һ�������ù̶��߳������̳߳أ��Թ�����޽���з�ʽ��������Щ�̡߳�
	public static ExecutorService newSingleThreadExecutor()������һ��ʹ�õ��� worker �̵߳� Executor�����޽���з�ʽ�����и��̡߳�

	����ֵ��ExecutorSeriver
		������
			Future<?> submit(Runnable task)
			<T> Future<T> submit(Callable<T> task)

 */
public class Demo {
	public static void main(String[] args) {
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		MyRunnable r1 = new MyRunnable();//��Ҫ5��
		MyRunnable r2 = new MyRunnable();//��Ҫ5��
		
		ser.submit(r1);
		ser.submit(r2);
		
		//�̳߳ص�Ч�������ٴ���Ҫ�����������߳�ʱ��
		
		try {
			System.out.println("����������5��......");
			Thread.sleep(1000 * 5);//Ϊ��ȷ�������߳�ִ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//��Ҫ�ٴ�ִ���������̣߳�
		//֮ǰ���ǵ�����ʵ�ֵķ�ʽ����ô����������ٴ�ʵ�����������󣬻���Ҫ10��
		//���ֱ��ʹ���̳߳�ȥ����
		ser.submit(r1);
		ser.submit(r2);
		
		ser.submit(r1);
		ser.submit(r2);
		
		ser.shutdown();
		
	}
}
