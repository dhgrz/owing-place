package com.itcast.demo08_获取成员方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 通过Class获取成员方法：
 * 
 * 1.public Method[] getMethods()：返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口的公共 member 方法。
 * 2.public Method getMethod(String name,Class... parameterTypes)：回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
 * 3.public Method[] getDeclaredMethods():返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
 * 4.public Method getDeclaredMethod(String name,Class... parameterTypes):返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。

   调用成员方法：
   	Method -->  public Object invoke(Object obj,Object... args)

 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class aClass = Class.forName("com.itcast.demo08_获取成员方法.Student");
		
		System.out.println("******获取所有的公有成员方法*********");
		//包括继承的
		Method[] methodArray = aClass.getMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		
		System.out.println("******获取所有的成员方法，包括私有的默认的保护的*********");
		//不包括继承的
		Method[] methodArray2 = aClass.getDeclaredMethods();
		for(Method m : methodArray2){
			System.out.println(m);
		}
		
		System.out.println("******获取某个公有的成员方法*********");
		//不包括继承的
		Method m1 = aClass.getMethod("show", char.class);
		System.out.println(m1);
		
		System.out.println("******获取某个非公有的成员方法，这里获取一个私有的*********");
		//不包括继承的
		Method m2 = aClass.getDeclaredMethod("show");
		System.out.println(m2);
		
		System.out.println("*******访问公有的成员方法*********");
		Object obj = aClass.getConstructor(char.class).newInstance('男');
		m1.invoke(obj, '男');
		
		System.out.println("*******访问私有的成员方法*********");
		m2.setAccessible(true);//暴力访问
		m2.invoke(obj);
		
		System.out.println("******访问一个带返回值的公有成员方法********");
		Method m3 = aClass.getMethod("fun", int.class,int.class);
		Object resultObj = m3.invoke(obj, 10,20);
		System.out.println("方法返回结果：" + resultObj);
		
		
		
		
	}
}
