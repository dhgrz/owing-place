package com.itcast.demo14_同步锁;

public class MyThread extends Thread{
	private Accound acc = null;//用户账户对象
	private String type = null;//用户标志：存，还是取
	public MyThread(Accound acc ,String type){
		this.acc = acc;
		this.type = type;
	}
	
	@Override
	public void run() {
		if(this.type.equals("存")){
			for(int i = 0;i < 200;i++){
				acc.add(100);
			}
			System.out.println("存钱完毕！");
		}else{
			for(int i = 0;i < 200;i++){
				acc.sub(100);
			}
			System.out.println("取钱完毕！");
		}
	}
	
	
}
