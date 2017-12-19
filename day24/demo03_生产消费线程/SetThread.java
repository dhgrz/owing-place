package com.itcast.demo03_生产消费线程;
import java.util.Random;
public class SetThread extends Thread{
	private NumberPool pool = null;
	public SetThread(NumberPool p){
		this.pool = p;
	}
	@Override
	public void run() {
		//生产一个1--100的数字
		Random rdm = new Random();
		while(true){
			//生产数字
			try {
				Thread.sleep(10);//慢点设置数字
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int i = rdm.nextInt(100) + 1;
			//设置数字
			this.pool.setNum(i);
		}
	}
}
