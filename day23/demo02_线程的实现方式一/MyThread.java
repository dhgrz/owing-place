package com.itcast.demo02_�̵߳�ʵ�ַ�ʽһ;

/**1.�Զ����࣬�̳���Thread���������ǵ������һ��Thread**/

public class MyThread extends Thread{
	//2.��дThread�е�run()���������߳���������Ҫ�������飬д��run()�����У�
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			System.out.println("i = " + i);
		}
	}
}
