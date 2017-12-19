package com.itcast.demo04_线程组;
/*
 * 线程组：好处，可以一次性最一个组内的所有线程做统一的设定；操作比较方便；
 * 
 * Thread类
 * 	构造方法：
 * 		Thread(ThreadGroup group, String name) 分配新的 Thread 对象。
 * 		还有其他带：ThreadGroup字样的构造方法都可以用；
 * 	成员方法：
 * 		ThreadGroup  grp = getThreadGroup();
 * 		默认情况下，获取的组名是main组
 * 
 * ThreadGroup类：线程组
 * 	构造方法：
 * 		ThreadGroup(String name) :构造一个新线程组。 
		ThreadGroup(ThreadGroup parent, String name)：创建一个新线程组。 
 * 	成员方法：
 * 		String getName();
 */
public class Demo {
	public static void main(String[] args) {
		//获取默认的组名
		/*MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		ThreadGroup grp = t1.getThreadGroup();
		ThreadGroup grp2 = t2.getThreadGroup();
		//
		System.out.println(grp.getName());
		System.out.println(grp2.getName());*/
		setGroup();
		//1.先实例化一个组对象
				ThreadGroup group1 = new ThreadGroup("我的线程组");
				//2.怎样将线程加入一个组？
				MyThread t1 = new MyThread(group1,"线程1");
				MyThread t2 = new MyThread(group1,"线程2");
				/*//3.启动
				t1.start();
				t2.start();*/
				//可以对组内的所有线程，做统一操作；
				//将线程组内的所有线程设为"守护线程"
				group1.setDaemon(true);
				t1.start();
				t2.start();
	}
	//将一些线程进行分组
	public static void setGroup(){
	}
}
