package com.itcast.demo03_��ȡ�������̵߳�����;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println("(" + this.getName() + ")i = " + i);
		}
	}
}
/*
 * ����е�Thread��
 * Thread{
 * 	private String name;
 * 	public void setName(String name){
 * 		this.name = name;
 * 	}
 * 	public String getName(){
 * 		return this.name;
 * 	}
 * }
 * ���ǵ����ࣺ
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
