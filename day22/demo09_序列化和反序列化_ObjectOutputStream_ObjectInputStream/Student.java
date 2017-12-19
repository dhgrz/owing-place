package com.itcast.demo09_���л��ͷ����л�_ObjectOutputStream_ObjectInputStream;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	//����ָ��sex�������л�ʹ�ùؼ��֣�transient
	private transient char sex;
	
	public Student(String name, int age , char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	
	
}
