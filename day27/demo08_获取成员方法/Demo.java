package com.itcast.demo08_��ȡ��Ա����;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * ͨ��Class��ȡ��Ա������
 * 
 * 1.public Method[] getMethods()������һ������ĳЩ Method ��������飬��Щ����ӳ�� Class ��������ʾ�����ӿڵĹ��� member ������
 * 2.public Method getMethod(String name,Class... parameterTypes)����һ�� Method ��������ӳ�� Class ��������ʾ�����ӿڵ�ָ��������Ա������
 * 3.public Method[] getDeclaredMethods():���� Method �����һ�����飬��Щ����ӳ�� Class �����ʾ�����ӿ����������з���������������������Ĭ�ϣ��������ʺ�˽�з��������������̳еķ�����
 * 4.public Method getDeclaredMethod(String name,Class... parameterTypes):����һ�� Method ���󣬸ö���ӳ�� Class ��������ʾ�����ӿڵ�ָ��������������

   ���ó�Ա������
   	Method -->  public Object invoke(Object obj,Object... args)

 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class aClass = Class.forName("com.itcast.demo08_��ȡ��Ա����.Student");
		
		System.out.println("******��ȡ���еĹ��г�Ա����*********");
		//�����̳е�
		Method[] methodArray = aClass.getMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		
		System.out.println("******��ȡ���еĳ�Ա����������˽�е�Ĭ�ϵı�����*********");
		//�������̳е�
		Method[] methodArray2 = aClass.getDeclaredMethods();
		for(Method m : methodArray2){
			System.out.println(m);
		}
		
		System.out.println("******��ȡĳ�����еĳ�Ա����*********");
		//�������̳е�
		Method m1 = aClass.getMethod("show", char.class);
		System.out.println(m1);
		
		System.out.println("******��ȡĳ���ǹ��еĳ�Ա�����������ȡһ��˽�е�*********");
		//�������̳е�
		Method m2 = aClass.getDeclaredMethod("show");
		System.out.println(m2);
		
		System.out.println("*******���ʹ��еĳ�Ա����*********");
		Object obj = aClass.getConstructor(char.class).newInstance('��');
		m1.invoke(obj, '��');
		
		System.out.println("*******����˽�еĳ�Ա����*********");
		m2.setAccessible(true);//��������
		m2.invoke(obj);
		
		System.out.println("******����һ��������ֵ�Ĺ��г�Ա����********");
		Method m3 = aClass.getMethod("fun", int.class,int.class);
		Object resultObj = m3.invoke(obj, 10,20);
		System.out.println("�������ؽ����" + resultObj);
		
		
		
		
	}
}
