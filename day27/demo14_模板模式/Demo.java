package com.itcast.demo14_ģ��ģʽ;

abstract class  Person{
	public  void show(){//ģ�巽��
		System.out.println("���Ǵ��ǲ��͵�һ����" + getType());
	}
	public abstract String getType();
}
class Student extends Person{
	public String getType() {
		return "ѧ��";
	}
}
class Teacher extends Person{
	public String getType() {
		return "��ʦ";
	}
}

public class Demo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.show();
		Teacher t = new Teacher();
		t.show();
	}
}
