package com.itcast.demo03_获取和设置线程的名称;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println("(" + this.getName() + ")i = " + i);
		}
	}
}
/*
 * 类库中的Thread类
 * Thread{
 * 	private String name;
 * 	public void setName(String name){
 * 		this.name = name;
 * 	}
 * 	public String getName(){
 * 		return this.name;
 * 	}
 * }
 * 我们的子类：
 * class MyThread extends Thread{
 * 		public void show(){
 * 			this.getName();
 * 			this.setName();
 * 		}
 * }
 * Demo{
 * 	main(){
 * 		MyThread t = new MyThread();
 * 		
 * 	}
 * }
 * 
 */
