package com.itcast.demo05_�̵߳ĵ���_sleep_����;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �̵߳����ߣ�Thread --> public static void sleep(long millis)
 */
public class Demo {
	public static void main(String[] args) {
		/*for(int i = 1 ;i <= 10;i++){
			//ÿ���ӡһ��
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = sdf.format(date);
			System.out.println("��ǰʱ�䣺 " + dateStr);
			//��Ϣ1��
			try {
				//��ǰ�߳�����
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		//�����߳�
		MyThread t = new MyThread();
		t.start();
	}
}
