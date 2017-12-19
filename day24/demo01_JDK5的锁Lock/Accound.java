package com.itcast.demo01_JDK5的锁Lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Accound {
	private int balance = 10000;
	private Lock lock = new ReentrantLock();
	//存钱
	/*public void add(int n){
		synchronized(this){
			this.balance += n;
		}
	}*/
	/*//取钱
	public void sub(int n){
		synchronized(this){
			this.balance -= n;
		}
	}*/
	//存钱，改为JDK1.5的方式使用Lock锁
	public void add(int n){
		lock.lock();//加锁
		try{
			this.balance += n;
		}finally{
			lock.unlock();//解锁
		}
	}
	public void sub(int n){
		lock.lock();//加锁
		try{
			this.balance -= n;
		}finally{
			lock.unlock();//解锁
		}
	}
	public int getBalance(){
		return this.balance;
	}
}
