package com.itcast.demo16_����ģʽ֮����ʽ;
/*
 *  1.���Ȳ����������������ʵ�����������췽��˽�л�
 * 	2.���౾��ȥʵ������
 * 	3.�ṩһ������Ĺ��з��������������������ã�
 * 
 * ����ʽ��
 *  1.���ڲ�����һ����̬�ı����������ã���Ϊ��Ա���ԣ�����ʼ��
 *  2.�ṩ���еĶ���ķ������ش����ã�
 */
public class Student {
	private Student(){
		
	}
	
	private static Student stu = new Student();//0x2233
	
	public static Student getInstance(){
		return stu;//ÿ�ε��ö��᷵�أ�0x2233
	}
	
	public void show(){
		System.out.println("is show()");
	}
}
