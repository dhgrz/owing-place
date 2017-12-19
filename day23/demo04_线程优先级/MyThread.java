package com.itcast.demo04_线程优先级;

public class MyThread extends Thread{
	private double sum = 0;
	@Override
	public void run() {
		//模拟很复杂的操作
		for(int i = 1 ;i <= 5; i++){
			for(int j = 1 ; j <= 20000000 ; j++){
				sum += (Math.PI + Math.E) / i;
				//每隔100000时，暂停一下,让其他的线程有机会执行
				if(j % 100000 == 0){
					Thread.yield();
				}
			}
			System.out.println(this.getName() + " 当前优先级：" + 
								this.getPriority() + " 执行完：" + i + " 次");
			
		}
	}
}
