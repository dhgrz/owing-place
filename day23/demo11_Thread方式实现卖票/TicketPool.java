package com.itcast.demo11_Thread��ʽʵ����Ʊ;

public class TicketPool {
	private int tickets = 100;
	
	public int getTicket(){//����1������2
		//����������Щ���ӵĲ�������Ҫ�ķ�5����
		try {
			Thread.sleep(5);//Ϊ�˶����������ͬһ��Ʊ��Ч�������ԣ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(tickets > 0){//����1�ж�true-->���룬����2�ж�true--����
			
			return this.tickets--;//����1ȡ10����"����2"��ռ,����2ȡ10��Ȼ������--:(--��������ԭ���ԣ���һϵ�е�ָ�����)
		}else{
			return 0;
		}
	}
}
