package com.itcast.demo17_����ģʽ֮����ʽ;
/*
 * ����ʽ��
 * 1.˽�г�Ա��������ʱ����ʼ����
 * 2.�ڹ��з����ڲ��жϳ�Ա�Ƿ�Ϊnull,�ǣ��ٳ�ʼ����
 * 3.�ڹ��з����ڲ����س�Ա������
 */
public class Student {
	private Student(){
		Runtime r;
	}
	private static Student stu = null;//��ʼ��Ϊnull�����������ʽ��ͬ
	
	public static Student getInstance(){
		if(stu == null){
			stu = new Student();
		}
		return stu;
	}
	public void show(){
		System.out.println("����ʽ-->show()");
	}
}
