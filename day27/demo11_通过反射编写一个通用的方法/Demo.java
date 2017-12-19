package com.itcast.demo11_通过反射编写一个通用的方法;

import java.lang.reflect.Field;

/*
 * 编写一个方法，可以为任何对象的某个属性赋值：
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		Student stu = new Student();
		setValue(stu,"name","张三");
		
		Teacher t = new Teacher();
		setValue(t,"age",33);
		
		System.out.println(stu);
		System.out.println(t);
		
	}
	
	public static void setValue(Object obj,String fieldName,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class aClass = obj.getClass();
		Field f = aClass.getDeclaredField(fieldName);
		f.setAccessible(true);
		f.set(obj, value);
		
	}
}
