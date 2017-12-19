package com.itcast.test;

public class Demo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(100);
		t.start();
	}
}
