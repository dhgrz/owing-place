package com.itcast.demo12_Runnable�ӿ�ʵ����Ʊ����;

import java.util.ArrayList;

public class SellTicketRunnable implements Runnable {
	private TicketPool pool = null;
	//ArrayList����֤�̰߳�ȫ
	private ArrayList<Integer> ticArray = new ArrayList<Integer>();

	public SellTicketRunnable(TicketPool pool) {
		this.pool = pool;

	}

	@Override
	public void run() {
		// һֱ��Ʊ��һֱ��������ֵΪ0
		while (true) {
			int t = this.pool.getTicket();
			if (t <= 0) {
				System.out.println("ûƱ�ˣ��ҽ����ˣ�");
				break;
			}
			// System.out.println(this.getName() + " ����Ʊ��" + t);
			ticArray.add(t);// ��Ʊװ��������
		}
		System.out.println(Thread.currentThread().getName() + " һ��������" + this.ticArray.size()
				+ " ��Ʊ��");
	}

}
