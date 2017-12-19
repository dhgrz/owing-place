package com.itcast.demo17_单例模式之懒汉式;
/*
 * 懒汉式：
 * 1.私有成员变量声明时不初始化；
 * 2.在公有方法内部判断成员是否为null,是：再初始化；
 * 3.在公有方法内部返回成员变量；
 */
public class Student {
	private Student(){
		Runtime r;
	}
	private static Student stu = null;//初始化为null，这里与饿汉式不同
	
	public static Student getInstance(){
		if(stu == null){
			stu = new Student();
		}
		return stu;
	}
	public void show(){
		System.out.println("懒汉式-->show()");
	}
}
