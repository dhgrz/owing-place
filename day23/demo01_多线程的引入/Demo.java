package com.itcast.demo01_多线程的引入;
/*
 * 为什么需要使用多线程：
 * 
 * 1.之前我们的程序都是顺序执行的，后面的代码都是要等待前面的代码执行完毕，才能获得执行；
 * 2.有些时候，当一个应用程序在做一件事的时候，很可能需要同时做其它的事情。
 *   比如：控制台等待用户输入的时候，如果此时需要同时接收网络数据，这时就需要编程语言为我们提供这种机制；
 *       QQ程序：聊天窗口，程序在等待用户输入数据，此时它也需要同时接收网络数据；还要同时刷新好友列表；
 *       
 * 3.所以很多程序都需要在做一件事情的时候，同时还要做其它的事情，这就需要编程语言提供这种机制。这种机制叫：多线程；
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println("main方法开始");
		fun1();
		fun2();//必须要等待fun1()执行完毕，才能获得执行
		fun3();//必须要等待fun2()执行完毕，才能获得执行
		System.out.println("main方法结束");//必须要等待上面的代码全部执行完毕，才能获得执行；
	}

	private static void fun1() {
		for(int i = 0; i < 20;i++){
			System.out.println("fun1 : " + i);
		}
	}
	private static void fun2() {
		for(int i = 0;i < 20;i++){
			System.out.println("fun2 : " + i);
		}
	}
	private static void fun3() {
		System.out.println("fun3获得执行");
	}
}
