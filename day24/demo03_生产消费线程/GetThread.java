package com.itcast.demo03_���������߳�;

public class GetThread extends Thread{
	private NumberPool pool = null;
	public GetThread(NumberPool p){
		this.pool = p;
	}
	@Override
	public void run() {
		while(true){
			Integer i = pool.getNum(Thread.currentThread().getName());
			
			System.out.println("���������ߣ��һ�ȡһ����" + i);
		}
	}
}	
