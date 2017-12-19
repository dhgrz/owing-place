package com.itcast.demo06_获取构造方法;

public class Student {
	//*********构造方法***********
	private Student(){
		System.out.println("私有构造方法");
	}
	Student(int n){
		System.out.println("默认访问级别构造方法");
	}
	protected Student(String n){
		System.out.println("受保护构造方法");
	}
	public Student(char n){
		System.out.println("公有构造方法");
	}
}
