package com.itcast.demo12_����ģʽ;

public class StudentProxy implements IStudent {
	private Student stu;
	
	public void coding() {
		check();
		if(stu == null){
			stu = new Student();
		}
		stu.coding();
		this.zj();
		
	}
	
	public boolean check(){
		System.out.println("�೤�������......");
		return true;
	}
	public void zj(){
		System.out.println("�೤�����ܽ�......");
	}

}
