package com.itcast.demo05_线程的调度_sleep_休眠;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i = 1 ;i <= 10;i++){
			//每秒打印一次
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = sdf.format(date);
			System.out.println("当前时间： " + dateStr);
			//休息1秒
			try {
				//当前线程休眠
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}	
