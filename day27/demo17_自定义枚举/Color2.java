package com.itcast.demo17_自定义枚举;

public class Color2 {
	private String name;
	public static final Color2 RED = new Color2("红");
	public static final Color2 GREEN = new Color2("绿");
	public static final Color2 BLUE = new Color2("蓝");
	
	private Color2(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Color2 [name=" + name + "]";
	}
	
	
	
	
}
