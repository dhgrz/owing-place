package com.itcast.demo06_�̼߳���_join;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("���ǣ�" + this.getName() + " ,��Ҫɱ��100.");
		for(int i = 0;i < 100;i++){
			System.out.println(this.getName() + " ɱ�У�" + (i + 1));
		}
	}
}
