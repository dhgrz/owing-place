package com.itcast.demo08_��ȡ��Ա����;

public class Student {
	//*********��Ա����************
	private String name;
	int age;
	protected char sex;
	public int score;
	
	//*********���췽��***********
	private Student(){
		System.out.println("˽�й��췽��");
	}
	Student(int n){
		System.out.println("Ĭ�Ϸ��ʼ����췽��");
	}
	protected Student(String n){
		System.out.println("�ܱ������췽��");
	}
	public Student(char n){
		System.out.println("���й��췽��");
	}
	//***************��Ա����******************//
	private void show(){
		System.out.println("private show()");
	}
	void show(int c){
		System.out.println("Ĭ�ϵ� show()");
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
