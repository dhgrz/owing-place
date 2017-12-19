package com.itcast.demo11_定时器删除指定的目录;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器删除指定的目录
 * 
 * 1.TimerTask:任务，
 * 		重写run()方法，
 * 		定义一个方法，用于递归调用：deleteFile()
 * 2.Timer:定时器
 * 		Timer t = new Timer();
 * 		t.schedule(TimerTask task, long delay)
 */
public class Demo {
	public static void main(String[] args) {
		Timer timer = new Timer();
		String dateStr = "2015-03-09 16:30:40";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateStr);
			timer.schedule(new MyTimerTask(), date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
class MyTimerTask extends TimerTask{
	public void run(){
		File file = new File("E:\\bbb");
		deleteFile(file);
		System.out.println("删除完毕！");
	}
	private boolean deleteFile(File f){
		File[] fileArray = f.listFiles();
		for(File file : fileArray){
			if(file.isDirectory()){
				deleteFile(file);
			}else{
				file.delete();//删文件
			}
		}
		f.delete();//删空目录
		return true;
	}
}
