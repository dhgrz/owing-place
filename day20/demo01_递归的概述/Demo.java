package com.itcast.demo01_递归的概述;
/*
 * 方法的递归调用：
 * 
 * 1.基于方法可以自己调用自己，这种情况就叫：方法的递归调用
 * 
 * 注意事项：
 * 	要有出口，否则就是死递归
	次数不能太多，否则就内存溢出
	构造方法不能递归使用

 */
public class Demo {
	
	private static int num = 1;
	public Demo(){
	//	this();
	}
	public static void main(String[] args) {
		show();
	}
	
	private static void show() {
		System.out.println("show() num = " + num++);
		if(num == 5){
			return;
		}
		show();
		
	}
	
}
