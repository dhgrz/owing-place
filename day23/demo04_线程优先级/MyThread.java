package com.itcast.demo04_�߳����ȼ�;

public class MyThread extends Thread{
	private double sum = 0;
	@Override
	public void run() {
		//ģ��ܸ��ӵĲ���
		for(int i = 1 ;i <= 5; i++){
			for(int j = 1 ; j <= 20000000 ; j++){
				sum += (Math.PI + Math.E) / i;
				//ÿ��100000ʱ����ͣһ��,���������߳��л���ִ��
				if(j % 100000 == 0){
					Thread.yield();
				}
			}
			System.out.println(this.getName() + " ��ǰ���ȼ���" + 
								this.getPriority() + " ִ���꣺" + i + " ��");
			
		}
	}
}
