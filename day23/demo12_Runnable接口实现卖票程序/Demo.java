package com.itcast.demo12_Runnable�ӿ�ʵ����Ʊ����;

public class Demo {
	public static void main(String[] args) {
		TicketPool pool = new TicketPool();
		
		SellTicketRunnable tRun1 = new SellTicketRunnable(pool);
		SellTicketRunnable tRun2 = new SellTicketRunnable(pool);
		SellTicketRunnable tRun3 = new SellTicketRunnable(pool);
		
		new Thread(tRun1,"����1").start();
		new Thread(tRun2,"����2").start();
		new Thread(tRun3,"����3").start();
	}
}
