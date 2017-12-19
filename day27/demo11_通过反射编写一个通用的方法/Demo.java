package com.itcast.demo11_ͨ�������дһ��ͨ�õķ���;

import java.lang.reflect.Field;

/*
 * ��дһ������������Ϊ�κζ����ĳ�����Ը�ֵ��
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		Student stu = new Student();
		setValue(stu,"name","����");
		
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
