package com.itcast.demo06_JDK5的线程池;

public class MyRunnable implements Runnable {
	public MyRunnable(){
		System.out.println("构造一个我，很费时喔，需要5秒！");
		for(int i = 0; i < 5;i++){
			System.out.println((i + 1) + " 秒......");
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
