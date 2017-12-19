package com.itcast.demo03_���������߳�;
import java.util.Random;
public class SetThread extends Thread{
	private NumberPool pool = null;
	public SetThread(NumberPool p){
		this.pool = p;
	}
	@Override
	public void run() {
		//����һ��1--100������
		Random rdm = new Random();
		while(true){
			//��������
			try {
				Thread.sleep(10);//������������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int i = rdm.nextInt(100) + 1;
			//��������
			this.pool.setNum(i);
		}
	}
}
