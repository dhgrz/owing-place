package com.itcast.demo09_ֹͣ�߳�_interrupt;

public class MyThread extends Thread{
	@Override
	public void run() {
		
		for(int i = 0;i < 20 ;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("�߳��׳��쳣��������������ˣ��ҽ���ִ�У�");
				break;
			}
			System.out.println("i = " + i);
		}
		
	}
}
