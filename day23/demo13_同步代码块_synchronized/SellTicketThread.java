package com.itcast.demo13_同步代码块_synchronized;

import java.util.ArrayList;

public class SellTicketThread extends Thread {
	private TicketPool tPool = null;
	private ArrayList<Integer> ticArray = new ArrayList<Integer>();
	
	public SellTicketThread(TicketPool pool){
		this.tPool = pool;
	}
	@Override
	public void run() {
		//一直抢票，一直抢到返回值为0
		while(true){
			int t = this.tPool.getTicket();
			if(t <= 0){
				System.out.println("没票了，我结束了！");
				break;
			}
		//	System.out.println(this.getName() + " 抢到票：" + t);
			ticArray.add(t);//将票装到集合中
		}
		System.out.println(this.getName() + " 一共抢到：" + this.ticArray.size() + " 张票！");
	}
}
