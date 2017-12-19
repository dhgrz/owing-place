package com.itcast.demo05_wait_sleep_yieldÇø±ð;

public class MyThread extends Thread {
	private NumberPool pool = null;
	public MyThread(NumberPool pool){
		this.pool = pool;
	}
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			this.pool.show(this.getName());
		}
	}
}
