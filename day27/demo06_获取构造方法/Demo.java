package com.itcast.demo06_获取构造方法;

import java.lang.reflect.Constructor;

/*
 * 要反向的加载一个类的对象：
 * 1.要先获取它的Class对象；我们使用第三种方式；
 * 2.通过这个Class对象可以查看这个类中的构造方法、成员属性、成员方法
 * 		1).构造方法：Constructor
 * 			public Constructor getConstructor(Class ... parameterTypes)：返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
			public Constructor[] getConstructors()：所有公有的构造方法：
			
			public Constructor getDeclaredConstructor(Class... parameterTypes):获取单个的构造方法。可以获取非公有的。
			public Constructor[] getDeclaredConstructors()：获取所有的构造方法，包括私有、默认、受保护、公有的

			a).要实例化此类的对象，就要执行它的构造方法：
				Constructor-->public T newInstance(Object... initargs)():
				如果需要调用私有构造方法：调用Constructor的setAccessible(true);//暴力访问
		2).字段：Field
		3).成员方法：Method
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		Class aClass = Class.forName("com.itcast.demo06_获取构造方法.Student");
		
		System.out.println("*********获取所有的公共构造方法*************");
		Constructor[] conArray = aClass.getConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}
		System.out.println("*********获取所有的构造方法****************");
		Constructor[] conArray2 = aClass.getDeclaredConstructors();
		for(Constructor c : conArray2){
			System.out.println(c);
		}
		
		System.out.println("*********获取单个的公有构造方法*************");
		Constructor publicCon = aClass.getConstructor(char.class);
		System.out.println(publicCon);
		//调用公有构造方法，构造一个Student
		Object obj = publicCon.newInstance('男');//会调用Student的公有构造方法；
		System.out.println("获取obj = " + obj);
		
		System.out.println("*********获取私有的构造方法*****************");
		Constructor privateCon = aClass.getDeclaredConstructor();
		System.out.println(privateCon);
		//调用私有构造方法构造一个Student
		privateCon.setAccessible(true);//就可以访问私有成员。暴力访问；
		Object obj2 = privateCon.newInstance();
		System.out.println("获取obj2 = " + obj2);
	}
}
