package com.itcast.demo16_单例模式之饿汉式;
/*
 * 什么是单例模式：
 * 单：一个
 * 例：对象
 * 单例：一个对象
 * 单例模式：在整个应用程序运行期间，有些类，全局只需要一个对象。这个时候这个类需要进行一些设计，否则，其它类可能会
 *       去实例化它。
 * 思路：
 * 1.首先不能让其他类任意的实例化；
 * 2.由类本身去实例化；
 * 3.提供一个对外的公有方法，返回这个对象的引用；
 * 
 * 将Student类作为单例模式的对象。
 */
public class Demo {
	public static void main(String[] args) {
		Student stu = Student.getInstance();
		stu.show();
		Student stu2 =Student.getInstance();
		stu2.show();
		Student stu3 =Student.getInstance();
		stu3.show();
		
		System.out.println(stu == stu2);
		System.out.println(stu2 == stu3);
		
		
		
	}
}
