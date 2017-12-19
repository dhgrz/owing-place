package com.itcast.demo17_自定义枚举;

public abstract class Color3 {
	private String name;
	public static final Color3 RED = new Color3("红"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
		}
	};
	public static final Color3 GREEN = new Color3("绿"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
		}
	};
	public static final Color3 BLUE = new Color3("蓝"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
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
