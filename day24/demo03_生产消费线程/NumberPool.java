package com.itcast.demo03_生产消费线程;
import java.util.ArrayList;
public class NumberPool {
	private ArrayList<Integer> intList = new ArrayList<Integer>();
	//设置数字的方法，此方法由"生产方"调用
	public synchronized void setNum(int n){
		this.intList.add(n);
		this.notifyAll();//Object类中 的方法。唤醒所有在当前对象上等待的线程；
	}
	//获取数字的方法，此方法由"消费方"调用
	public synchronized Integer getNum(String threadName){
		//如果集合中有数据，直接返第一个数据，然后删除掉集合的第一个数据
		if(intList.size() == 0){
			//让消费方等待
			try {
				System.out.println(threadName + " 开始等待......");
				this.wait();//Object-->wait()方法:让当前访问的线程等待，等待被我唤醒
				System.out.println(threadName + " 被唤醒！");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Integer i = intList.get(0);
		intList.remove(0);
		return i;
	}
}
