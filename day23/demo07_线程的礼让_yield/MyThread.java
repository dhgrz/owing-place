package com.itcast.demo07_Ïß³ÌµÄÀñÈÃ_yield;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;i < 100 ;i ++){
			String name = this.getName();
			if(name.equals("µË³¬")){
				this.yield();
			}
			System.out.println(this.getName() + " i = " + i);
		}
	}
}
