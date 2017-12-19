package com.itcast.demo09_停止线程_interrupt;
/*
 * 停止线程：
 * 	public final void stop()：
	public void interrupt()：

 */
public class Demo {
	public static void main(String[] args) {
		//启动MyThread,MyThread中的run会执行20秒，我们可以在主进程中，让
		//MyThread执行3秒后，如果没有停止，那么就强行停止它
		MyThread t = new MyThread();
		t.start();
		
		/*try {
			Thread.sleep(1000 * 3);//等待3秒，MyThread会执行3秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//强行去停止MyThread
	//	t.stop();//停止线程，但此方法已过时；
		t.interrupt();//stop的替换方法；去使MyThread的run()抛出一个异常，在异常中，我们去结束线程执行；
		
	}
}
