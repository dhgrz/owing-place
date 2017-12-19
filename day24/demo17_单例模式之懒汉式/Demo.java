package com.itcast.demo17_单例模式之懒汉式;

public class Demo {
	public static void main(String[] args) {
		Student stu1 = Student.getInstance();
		stu1.show();
		Student stu2 = Student.getInstance();
		stu2.show();
		System.out.println(stu1 == stu2);
		
	}
}
