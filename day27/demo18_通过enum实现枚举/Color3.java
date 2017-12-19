package com.itcast.demo18_通过enum实现枚举;

import com.itcast.demo17_自定义枚举.Color2;

public enum Color3 {
	RED("红"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
		}
	}
	,GREEN("绿"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
		}
		
	},BLUE("蓝"){
		public void show(){
			System.out.println("我是：" + this.getName() + " 颜色的");
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
