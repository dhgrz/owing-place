package com.itcast.demo08_接收Callable的返回值;
/*
 * 求1---？的和，最大值从构造函数接收
 */
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int maxNum = 1;
	public MyCallable(int maxNum){
		this.maxNum = maxNum;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = 1 ;i <= maxNum;i++){
			sum+=i;
		}
		return sum;
	}

}
