package com.itcast.demo04_�߳���;

public class MyThread extends Thread{
	public MyThread(ThreadGroup group,String name){
		super(group,name);
	}
	public void run() {
		for(int i = 0;i < 2000;i++){
			System.out.println(this.getName() + "i = " + i);
		}
	};
}
