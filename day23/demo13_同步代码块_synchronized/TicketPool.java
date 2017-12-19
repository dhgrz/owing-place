package com.itcast.demo13_同步代码块_synchronized;

public class TicketPool {
	private int tickets = 100;
	
	public int getTicket(){//窗口1，窗口2
		//比如这里有些复杂的操作，需要耗费5毫秒
		synchronized(this){//下面这段代码具有多线程的安全性：窗口1 先进入
			try {//这段代码块将会被锁定，不允许其它线程访问。如果有线程访问，将会列队等待，直到窗口1执行完毕；
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(tickets > 0){
				return this.tickets--;
			}else{
				return 0;
			}
		}
		//窗口1 执行完毕，解锁，其它线程才可以进入
	}
}
