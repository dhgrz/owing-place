package com.itcast.demo13_ͬ�������_synchronized;

import java.util.ArrayList;

public class SellTicketThread extends Thread {
	private TicketPool tPool = null;
	private ArrayList<Integer> ticArray = new ArrayList<Integer>();
	
	public SellTicketThread(TicketPool pool){
		this.tPool = pool;
	}
	@Override
	public void run() {
		//һֱ��Ʊ��һֱ��������ֵΪ0
		while(true){
			int t = this.tPool.getTicket();
			if(t <= 0){
				System.out.println("ûƱ�ˣ��ҽ����ˣ�");
				break;
			}
		//	System.out.println(this.getName() + " ����Ʊ��" + t);
			ticArray.add(t);//��Ʊװ��������
		}
		System.out.println(this.getName() + " һ��������" + this.ticArray.size() + " ��Ʊ��");
	}
}
