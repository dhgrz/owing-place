package com.itcast.demo14_ͬ����;
/*
 * synchronized(this){
 * 
 * }
 * ʹ��this����Ե�ǰ�����������һ���̷߳����ҵ�һ��synchronized�����ʱ�������߳�
 * ���ܷ��ʴ˶��������synchronized�Ĵ����
 * 
 * ��һ�������ڲ����д��붼��ͬ�������ʱ�����Խ�������Ϊͬ���ġ���ʽ���ڷ�������ʱ��ʹ�ùؼ���synchronized
 */
public class Accound {
	private int balance = 10000;
	
	//ͬ�������
	public void add(int n){
		//this=0x2233
		synchronized(this){//�����Լ���������ʾ�ҵ�������synchronized�ķ���������鶼���ܱ��������̷߳���
			this.balance += n;//����Ǯ���̷߳��ʴ˶δ���ʱ��ȡǮ���̲߳��ܷ��ʴ˶��������synchronized����飬Ҳ���ǲ��ܷ���sub����
		}
	}
	/*public synchronized void add(int n){
		
		this.balance += n;//����Ǯ���̷߳��ʴ˶δ���ʱ��ȡǮ���̲߳��ܷ��ʴ˶��������synchronized����飬Ҳ���ǲ��ܷ���sub����
		
	}*/
	//ͬ�������
	/*public void sub(int n){
		synchronized(this){
			this.balance -= n;
		}
	}*/
	//ͬ����������ʾ�˷������������̷߳��ʵ�������ǰ�ȫ��
	public synchronized void sub(int n){
		this.balance -= n;
		
	}
	public int getBalance(){
		return this.balance;
	}
}
