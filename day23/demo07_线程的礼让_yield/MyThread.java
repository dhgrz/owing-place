package com.itcast.demo07_�̵߳�����_yield;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;i < 100 ;i ++){
			String name = this.getName();
			if(name.equals("�˳�")){
				this.yield();
			}
			System.out.println(this.getName() + " i = " + i);
		}
	}
}
