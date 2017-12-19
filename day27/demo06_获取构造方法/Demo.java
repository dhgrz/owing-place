package com.itcast.demo06_��ȡ���췽��;

import java.lang.reflect.Constructor;

/*
 * Ҫ����ļ���һ����Ķ���
 * 1.Ҫ�Ȼ�ȡ����Class��������ʹ�õ����ַ�ʽ��
 * 2.ͨ�����Class������Բ鿴������еĹ��췽������Ա���ԡ���Ա����
 * 		1).���췽����Constructor
 * 			public Constructor getConstructor(Class ... parameterTypes)������һ�� Constructor ��������ӳ�� Class ��������ʾ�����ָ���������췽����
			public Constructor[] getConstructors()�����й��еĹ��췽����
			
			public Constructor getDeclaredConstructor(Class... parameterTypes):��ȡ�����Ĺ��췽�������Ի�ȡ�ǹ��еġ�
			public Constructor[] getDeclaredConstructors()����ȡ���еĹ��췽��������˽�С�Ĭ�ϡ��ܱ��������е�

			a).Ҫʵ��������Ķ��󣬾�Ҫִ�����Ĺ��췽����
				Constructor-->public T newInstance(Object... initargs)():
				�����Ҫ����˽�й��췽��������Constructor��setAccessible(true);//��������
		2).�ֶΣ�Field
		3).��Ա������Method
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		Class aClass = Class.forName("com.itcast.demo06_��ȡ���췽��.Student");
		
		System.out.println("*********��ȡ���еĹ������췽��*************");
		Constructor[] conArray = aClass.getConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}
		System.out.println("*********��ȡ���еĹ��췽��****************");
		Constructor[] conArray2 = aClass.getDeclaredConstructors();
		for(Constructor c : conArray2){
			System.out.println(c);
		}
		
		System.out.println("*********��ȡ�����Ĺ��й��췽��*************");
		Constructor publicCon = aClass.getConstructor(char.class);
		System.out.println(publicCon);
		//���ù��й��췽��������һ��Student
		Object obj = publicCon.newInstance('��');//�����Student�Ĺ��й��췽����
		System.out.println("��ȡobj = " + obj);
		
		System.out.println("*********��ȡ˽�еĹ��췽��*****************");
		Constructor privateCon = aClass.getDeclaredConstructor();
		System.out.println(privateCon);
		//����˽�й��췽������һ��Student
		privateCon.setAccessible(true);//�Ϳ��Է���˽�г�Ա���������ʣ�
		Object obj2 = privateCon.newInstance();
		System.out.println("��ȡobj2 = " + obj2);
	}
}
