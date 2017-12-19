package com.itcast.demo12_Runnable接口实现卖票程序;

public class TicketPool {
	private int tickets = 100;
	
	public int getTicket(){
		if(tickets > 0){
			return this.tickets--;
		}else{
			return 0;
		}
	}
}
