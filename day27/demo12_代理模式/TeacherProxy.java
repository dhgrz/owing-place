package com.itcast.demo12_����ģʽ;

public class TeacherProxy implements ITeacher {

	public void teach() {
		this.check();
		new Teacher().teach();
		this.zj();
	}
	public boolean check(){
		System.out.println("��ʦ�ܼ��������......");
		return true;
	}
	public void zj(){
		System.out.println("��ʦ�ܼ�����ܽ�......");
	}

}
