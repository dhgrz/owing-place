package com.itcast.demo16_����ģʽ֮����ʽ;
/*
 * ʲô�ǵ���ģʽ��
 * ����һ��
 * ��������
 * ������һ������
 * ����ģʽ��������Ӧ�ó��������ڼ䣬��Щ�࣬ȫ��ֻ��Ҫһ���������ʱ���������Ҫ����һЩ��ƣ�������������ܻ�
 *       ȥʵ��������
 * ˼·��
 * 1.���Ȳ����������������ʵ������
 * 2.���౾��ȥʵ������
 * 3.�ṩһ������Ĺ��з��������������������ã�
 * 
 * ��Student����Ϊ����ģʽ�Ķ���
 */
public class Demo {
	public static void main(String[] args) {
		Student stu = Student.getInstance();
		stu.show();
		Student stu2 =Student.getInstance();
		stu2.show();
		Student stu3 =Student.getInstance();
		stu3.show();
		
		System.out.println(stu == stu2);
		System.out.println(stu2 == stu3);
		
		
		
	}
}
