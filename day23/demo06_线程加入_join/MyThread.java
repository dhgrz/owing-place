package com.itcast.demo06_线程加入_join;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("我是：" + this.getName() + " ,我要杀敌100.");
		for(int i = 0;i < 100;i++){
			System.out.println(this.getName() + " 杀敌：" + (i + 1));
		}
	}
}
