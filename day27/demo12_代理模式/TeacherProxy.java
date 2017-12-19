package com.itcast.demo12_代理模式;

public class TeacherProxy implements ITeacher {

	public void teach() {
		this.check();
		new Teacher().teach();
		this.zj();
	}
	public boolean check(){
		System.out.println("教师总监先期审核......");
		return true;
	}
	public void zj(){
		System.out.println("教师总监后期总结......");
	}

}
