package com.itcast.demo12_代理模式;

public class Demo {
	public static void main(String[] args) {
		/*Student stu = new Student();
		stu.coding();*/
		
		IStudent stu = new StudentProxy();
		stu.coding();
		
		ITeacher t = new TeacherProxy();
		t.teach();
	}
}
