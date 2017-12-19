package com.itcast.demo02_线程的实现方式一;

/**1.自定义类，继承自Thread。代表我们的类就是一个Thread**/

public class MyThread extends Thread{
	//2.重写Thread中的run()方法；在线程启动后，需要做的事情，写在run()方法中；
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println("i = " + i);
		}
	}
}
