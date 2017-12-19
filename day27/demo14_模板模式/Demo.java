package com.itcast.demo14_模板模式;

abstract class  Person{
	public  void show(){//模板方法
		System.out.println("我是传智播客的一名：" + getType());
	}
	public abstract String getType();
}
class Student extends Person{
	public String getType() {
		return "学生";
	}
}
class Teacher extends Person{
	public String getType() {
		return "教师";
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
