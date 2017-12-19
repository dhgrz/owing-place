package com.itcast.demo01_JDK5����Lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Accound {
	private int balance = 10000;
	private Lock lock = new ReentrantLock();
	//��Ǯ
	/*public void add(int n){
		synchronized(this){
			this.balance += n;
		}
	}*/
	/*//ȡǮ
	public void sub(int n){
		synchronized(this){
			this.balance -= n;
		}
	}*/
	//��Ǯ����ΪJDK1.5�ķ�ʽʹ��Lock��
	public void add(int n){
		lock.lock();//����
		try{
			this.balance += n;
		}finally{
			lock.unlock();//����
		}
	}
	public void sub(int n){
		lock.lock();//����
		try{
			this.balance -= n;
		}finally{
			lock.unlock();//����
		}
	}
	public int getBalance(){
		return this.balance;
	}
}
