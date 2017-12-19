package com.itcast.demo09_停止线程_interrupt;

public class MyThread extends Thread{
	@Override
	public void run() {
		
		for(int i = 0;i < 20 ;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("线程抛出异常，出现意外情况了，我结束执行！");
				break;
			}
			System.out.println("i = " + i);
		}
		
	}
}
