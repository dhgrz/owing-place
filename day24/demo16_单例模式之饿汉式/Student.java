package com.itcast.demo16_单例模式之饿汉式;
/*
 *  1.首先不能让其他类任意的实例化；将构造方法私有化
 * 	2.由类本身去实例化；
 * 	3.提供一个对外的公有方法，返回这个对象的引用；
 * 
 * 饿汉式：
 *  1.类内部持有一个静态的本类对象的引用，作为成员属性；并初始化
 *  2.提供公有的对外的方法返回此引用；
 */
public class Student {
	private Student(){
		
	}
	
	private static Student stu = new Student();//0x2233
	
	public static Student getInstance(){
		return stu;//每次调用都会返回：0x2233
	}
	
	public void show(){
		System.out.println("is show()");
	}
}
