package com.itcast.demo18_ͨ��enumʵ��ö��;

import com.itcast.demo17_�Զ���ö��.Color2;

public enum Color3 {
	RED("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
	}
	,GREEN("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
		
	},BLUE("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
	};
	private String name;
	private Color3(String n){
		this.name = n;
	}
	
	@Override
	public String toString(){
		return "name = " + this.name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract void show();
}
