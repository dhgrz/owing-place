package com.itcast.demo03_获取和设置线程的名称;
/*
 * 获取和设置线程的名称：
 * 
 * 1.一个线程类，可以实例化多个对象，每个对象都可以作为一个独立的线程去运行；
 * 2.一个Thread对象可以设置线程名称，获取线程名称：
 *   默认线程名称：Thread + 编号 ： 编号从0开始，第一个启动的编号为0；
 *   setName设置线程名称：
 *   getName获取线程名称：
 * 
 */
public class Demo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("邓超");
		t2.setName("孙俪");
		
		t1.start();
		t2.start();
	}
}
