package com.itcast.demo07_��ȡ��Ա����;

import java.lang.reflect.Field;

/*
 * 2.ͨ��Class��ȡ��Ա������Field
 * 		public Field[] getFields():���й��е�
 * 		public Field   getField(String name):�������е�
 * 		public Field[] getDeclaredFields():���еĳ�Ա���ԣ�����˽�У�Ĭ�ϡ��ܱ�����
 * 		public Field getDeclaredField(String name)����ȡ�����ģ�����˽��....
 * 		
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		Class aClass = Class.forName("com.itcast.demo07_��ȡ��Ա����.Student");
		
		//*********��ȡ���еĹ��г�Ա************
		System.out.println("*******��ȡ���еĹ��г�Ա***********");
		Field[] fieldArray = aClass.getFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("*******��ȡ���еĳ�Ա,����˽��***********");
		Field[] fieldArray2 = aClass.getDeclaredFields();
		for(Field f : fieldArray2){
			System.out.println(f);
		}
		System.out.println("*******��ȡĳ�����г�Ա***********");
		Field f1 = aClass.getField("score");
		System.out.println(f1);
		
		System.out.println("*******��ȡĳ����Ա,����˽��***********");
		Field f2 = aClass.getDeclaredField("name");//˽�е�
		System.out.println(f2);
		
		//******Ϊ��Ա���Ը�ֵ*********
		//��ȡ����Ķ���
		Object obj = aClass.getConstructor(char.class).newInstance('��');
		f1.set(obj, 88);
		f2.setAccessible(true);//��������
		f2.set(obj, "������");
		System.out.println(obj);
		
	}
}
