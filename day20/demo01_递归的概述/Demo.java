package com.itcast.demo01_�ݹ�ĸ���;
/*
 * �����ĵݹ���ã�
 * 
 * 1.���ڷ��������Լ������Լ�����������ͽУ������ĵݹ����
 * 
 * ע�����
 * 	Ҫ�г��ڣ�����������ݹ�
	��������̫�࣬������ڴ����
	���췽�����ܵݹ�ʹ��

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
