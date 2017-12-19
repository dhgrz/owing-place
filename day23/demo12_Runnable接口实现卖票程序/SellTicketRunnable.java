package com.itcast.demo12_Runnable接口实现卖票程序;

import java.util.ArrayList;

public class SellTicketRunnable implements Runnable {
	private TicketPool pool = null;
	//ArrayList不保证线程安全
	private ArrayList<Integer> ticArray = new ArrayList<Integer>();

	public SellTicketRunnable(TicketPool pool) {
		this.pool = pool;

	}

	@Override
	public void run() {
		// 一直抢票，一直抢到返回值为0
		while (true) {
			int t = this.pool.getTicket();
			if (t <= 0) {
				System.out.println("没票了，我结束了！");
				break;
			}
			// System.out.println(this.getName() + " 抢到票：" + t);
			ticArray.add(t);// 将票装到集合中
		}
		System.out.println(Thread.currentThread().getName() + " 一共抢到：" + this.ticArray.size()
				+ " 张票！");
	}

}
