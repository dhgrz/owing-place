package com.itcast.demo07_获取成员属性;

public class Student {
	//*********成员属性************
	private String name;
	int age;
	protected char sex;
	public int score;
	
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", score=" + score + "]";
	}
	
}
