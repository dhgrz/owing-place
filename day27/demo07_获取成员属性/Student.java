package com.itcast.demo07_��ȡ��Ա����;

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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", score=" + score + "]";
	}
	
}
