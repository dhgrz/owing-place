package com.itcast.demo08_����Callable�ķ���ֵ;
/*
 * ��1---���ĺͣ����ֵ�ӹ��캯������
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
