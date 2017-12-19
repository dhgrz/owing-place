package com.itcast.demo11_Thread方式实现卖票;

public class TicketPool {
	private int tickets = 100;
	
	public int getTicket(){//窗口1，窗口2
		//比如这里有些复杂的操作，需要耗费5毫秒
		try {
			Thread.sleep(5);//为了多个窗口抢到同一张票的效果更明显；
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(tickets > 0){//窗口1判断true-->进入，窗口2判断true--进入
			
			return this.tickets--;//窗口1取10，被"窗口2"抢占,窗口2取10，然后再做--:(--操作不是原子性，由一系列的指令组成)
		}else{
			return 0;
		}
	}
}
