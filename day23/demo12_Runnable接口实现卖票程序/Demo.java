package com.itcast.demo12_Runnable接口实现卖票程序;

public class Demo {
	public static void main(String[] args) {
		TicketPool pool = new TicketPool();
		
		SellTicketRunnable tRun1 = new SellTicketRunnable(pool);
		SellTicketRunnable tRun2 = new SellTicketRunnable(pool);
		SellTicketRunnable tRun3 = new SellTicketRunnable(pool);
		
		new Thread(tRun1,"窗口1").start();
		new Thread(tRun2,"窗口2").start();
		new Thread(tRun3,"窗口3").start();
	}
}
