package com.itcast.demo05_��ȡClass��������ַ�ʽ;
/*
 * ��ȡClass��������ַ�ʽ��
 * 
 * 1.Object��-->getClass()
 * 2.��������.class:�κ��������Ͷ���һ����̬��class���ԣ����Ի�ȡ����Class����
 * 3.Class���и�������static forName(String className)
 * 
 * ��������ӣ�ȫ��ʹ�õ����ַ�ʽ��
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.��ȡClass����ĵ�һ�ַ�ʽ
		Student stu1 = new Student();
		Class c1 = stu1.getClass();
		System.out.println("c1 = " + c1);//class com.itcast.demo05_��ȡClass��������ַ�ʽ.Student
		
		Student stu2 = new Student();
		Class c2 = stu2.getClass();
		System.out.println("c2 = " + c2);//class com.itcast.demo05_��ȡClass��������ַ�ʽ.Student
		
		System.out.println("c1 == c2 : " + (c1 == c2));//true
		
		//2.��ȡClass����ĵڶ��ַ�ʽ
		Class c3 = Student.class;
		System.out.println("c3 = " + c3);
		System.out.println("c2 == c3 : " + (c2 == c3));//true
		System.out.println("int.class : " + int.class);
		System.out.println("float.class : " + float.class);
		
		//3.��ȡClass����ķ�ʽ����
	//	Class c4 = Class.forName("Student");//�쳣����Ҫȫ���޶�������
		Class c4 = Class.forName("com.itcast.demo05_��ȡClass��������ַ�ʽ.Student");
		System.out.println("c4 = " + c4);
		
		
		
	}
}
