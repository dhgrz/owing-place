package com.itcast.demo17_�Զ���ö��;

public abstract class Color3 {
	private String name;
	public static final Color3 RED = new Color3("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
	};
	public static final Color3 GREEN = new Color3("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
	};
	public static final Color3 BLUE = new Color3("��"){
		public void show(){
			System.out.println("���ǣ�" + this.getName() + " ��ɫ��");
		}
	};
	
	private Color3(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Color3 [name=" + name + "]";
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract void show();
}
