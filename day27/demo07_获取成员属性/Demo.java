package com.itcast.demo07_获取成员属性;

import java.lang.reflect.Field;

/*
 * 2.通过Class获取成员变量：Field
 * 		public Field[] getFields():所有公有的
 * 		public Field   getField(String name):单个公有的
 * 		public Field[] getDeclaredFields():所有的成员属性，包括私有，默认、受保护；
 * 		public Field getDeclaredField(String name)：获取单个的，包括私有....
 * 		
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		Class aClass = Class.forName("com.itcast.demo07_获取成员属性.Student");
		
		//*********获取所有的公有成员************
		System.out.println("*******获取所有的公有成员***********");
		Field[] fieldArray = aClass.getFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("*******获取所有的成员,包括私有***********");
		Field[] fieldArray2 = aClass.getDeclaredFields();
		for(Field f : fieldArray2){
			System.out.println(f);
		}
		System.out.println("*******获取某个公有成员***********");
		Field f1 = aClass.getField("score");
		System.out.println(f1);
		
		System.out.println("*******获取某个成员,包括私有***********");
		Field f2 = aClass.getDeclaredField("name");//私有的
		System.out.println(f2);
		
		//******为成员属性赋值*********
		//获取此类的对象
		Object obj = aClass.getConstructor(char.class).newInstance('男');
		f1.set(obj, 88);
		f2.setAccessible(true);//暴力访问
		f2.set(obj, "章子怡");
		System.out.println(obj);
		
	}
}
