package com.itcast.demo06_JDK5���̳߳�;

public class MyRunnable implements Runnable {
	public MyRunnable(){
		System.out.println("����һ���ң��ܷ�ʱร���Ҫ5�룡");
		for(int i = 0; i < 5;i++){
			System.out.println((i + 1) + " ��......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}

	}

}
