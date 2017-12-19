package com.itcast.demo14_同步锁;
/*
 * synchronized(this){
 * 
 * }
 * 使用this代表对当前对象加锁，当一个线程访问我的一个synchronized代码块时，其它线程
 * 不能访问此对象的其它synchronized的代码块
 * 
 * 当一个方法内部所有代码都是同步代码块时，可以将方法设为同步的。方式：在方法声明时，使用关键字synchronized
 */
public class Accound {
	private int balance = 10000;
	
	//同步代码块
	public void add(int n){
		//this=0x2233
		synchronized(this){//对我自己加锁。表示我的其它的synchronized的方法及代码块都不能被其它的线程访问
			this.balance += n;//当存钱的线程访问此段代码时，取钱的线程不能访问此对象的其它synchronized代码块，也就是不能访问sub方法
		}
	}
	/*public synchronized void add(int n){
		
		this.balance += n;//当存钱的线程访问此段代码时，取钱的线程不能访问此对象的其它synchronized代码块，也就是不能访问sub方法
		
	}*/
	//同步代码块
	/*public void sub(int n){
		synchronized(this){
			this.balance -= n;
		}
	}*/
	//同步方法：表示此方法带锁，多线程访问的情况下是安全的
	public synchronized void sub(int n){
		this.balance -= n;
		
	}
	public int getBalance(){
		return this.balance;
	}
}
