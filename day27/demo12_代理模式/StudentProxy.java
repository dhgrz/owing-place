package com.itcast.demo12_代理模式;

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
		System.out.println("班长先期审核......");
		return true;
	}
	public void zj(){
		System.out.println("班长后期总结......");
	}

}
