package com.itcast.demo06_��ȡ���췽��;

public class Student {
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
}
