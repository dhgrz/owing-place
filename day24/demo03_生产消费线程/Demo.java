package com.itcast.demo03_生产消费线程;
import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		NumberPool pool = new NumberPool();
		SetThread setTh = new SetThread(pool);
		GetThread getTh1 = new GetThread(pool);
		getTh1.setName("线程1");
		setTh.start();
		getTh1.start();
	}
}