package com.itcast.demo08_获取成员方法;

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
	//***************成员方法******************//
	private void show(){
		System.out.println("private show()");
	}
	void show(int c){
		System.out.println("默认的 show()");
	}
	protected void show(String s){
		System.out.println("protected show()");
	}
	public void show(char c){
		System.out.println("public show()");
	}
	public int fun(int a , int b){
		return a + b;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", score=" + score + "]";
	}
	
}
