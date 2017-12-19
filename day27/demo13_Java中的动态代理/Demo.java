package com.itcast.demo13_Java�еĶ�̬����;

import java.lang.reflect.Proxy;

/*
 * ʵ�ֶ�̬����
 * ���裺
 * 1.ʵ��һ���ӿڣ�InvocationHandler��-->������ȥ��������ϣ�����õķ���������֮ǰ����֮��ȥ��һЩ�����Ķ��������
 * 2.Proxy.newProxyInstance()��������ȡһ�������ʵ��
 */
public class Demo {
	public static void main(String[] args) {

		IStudent stu = (IStudent) Proxy.newProxyInstance(
				Student.class.getClassLoader(), Student.class.getInterfaces(),
				new MyHandler(new Student())); // ��ȡ��һ��Student�Ĵ������
		stu.coding();

		IDog dog = (IDog) Proxy.newProxyInstance(Dog.class.getClassLoader(),
				Dog.class.getInterfaces(), new MyHandler(new Dog()));
		dog.eat();
	}
}
