package com.itcast.demo18_通过enum实现枚举;

public enum Color2 {
	RED("红"),GREEN("绿"),BLUE("蓝");
	
	private String name;
	private Color2(String n){
		this.name = n;
	}
	
	@Override
	public String toString(){
		return "name = " + this.name;
	}
}
