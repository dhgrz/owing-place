package com.itcast.demo13_ͬ�������_synchronized;

public class TicketPool {
	private int tickets = 100;
	
	public int getTicket(){//����1������2
		//����������Щ���ӵĲ�������Ҫ�ķ�5����
		synchronized(this){//������δ�����ж��̵߳İ�ȫ�ԣ�����1 �Ƚ���
			try {//��δ���齫�ᱻ�����������������̷߳��ʡ�������̷߳��ʣ������жӵȴ���ֱ������1ִ����ϣ�
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
		//����1 ִ����ϣ������������̲߳ſ��Խ���
	}
}
