package com.itcast.demo03_生产消费线程;

public class GetThread extends Thread{
	private NumberPool pool = null;
	public GetThread(NumberPool p){
		this.pool = p;
	}
	@Override
	public void run() {
		while(true){
			Integer i = pool.getNum(Thread.currentThread().getName());
			
			System.out.println("我是消费者，我获取一个：" + i);
		}
	}
}	
