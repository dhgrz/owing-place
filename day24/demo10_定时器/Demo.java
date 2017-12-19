package com.itcast.demo10_定时器;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：在指定的时间，做某件事情；
 * 		指定在特定的时间之后，去做某件事情；
 *      指定在特定的时间之后，每隔多长时间，去反复的做一件事情；
 * Java中的定时器，使用两个类：
 * Timer:定时器：
 * 		构造方法：
 * 			public Timer()
 * 		成员方法：
 * 			public void schedule(TimerTask task, long delay)
			public void schedule(TimerTask task,long delay,long period)

 * TimerTask(抽象类):做任务；
 * 1.自定义类，继承自TimerTask;
 * 2.实现run()方法；
 * 		
 */
public class Demo {
	public static void main(String[] args) {
		Timer timer = new Timer();
	//	timer.schedule(new MyTimerTask(timer), 3000);//3秒之后做任务，但只执行一次
		timer.schedule(new MyTimerTask(timer), 3000, 2000);//3秒之后开始做任务，做完一次后，每隔2秒重复再做
		
	}
}
class MyTimerTask extends TimerTask{
	private Timer timer = null;
	public MyTimerTask(Timer t){
		this.timer = t;
	}
	@Override
	public void run() {
		System.out.println("嘣，爆炸了.....");
		
	}
	
}
