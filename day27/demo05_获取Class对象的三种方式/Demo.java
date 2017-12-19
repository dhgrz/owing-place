package com.itcast.demo05_获取Class对象的三种方式;
/*
 * 获取Class对象的三种方式：
 * 
 * 1.Object类-->getClass()
 * 2.数据类型.class:任何数据类型都有一个静态的class属性，可以获取它的Class对象
 * 3.Class类有个方法：static forName(String className)
 * 
 * 今天的例子，全部使用第三种方式；
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.获取Class对象的第一种方式
		Student stu1 = new Student();
		Class c1 = stu1.getClass();
		System.out.println("c1 = " + c1);//class com.itcast.demo05_获取Class对象的三种方式.Student
		
		Student stu2 = new Student();
		Class c2 = stu2.getClass();
		System.out.println("c2 = " + c2);//class com.itcast.demo05_获取Class对象的三种方式.Student
		
		System.out.println("c1 == c2 : " + (c1 == c2));//true
		
		//2.获取Class对象的第二种方式
		Class c3 = Student.class;
		System.out.println("c3 = " + c3);
		System.out.println("c2 == c3 : " + (c2 == c3));//true
		System.out.println("int.class : " + int.class);
		System.out.println("float.class : " + float.class);
		
		//3.获取Class对象的方式三：
	//	Class c4 = Class.forName("Student");//异常。需要全名限定的类名
		Class c4 = Class.forName("com.itcast.demo05_获取Class对象的三种方式.Student");
		System.out.println("c4 = " + c4);
		
		
		
	}
}
