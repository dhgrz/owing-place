package com.itcast.demo17_�Զ���ö��;

public class Color2 {
	private String name;
	public static final Color2 RED = new Color2("��");
	public static final Color2 GREEN = new Color2("��");
	public static final Color2 BLUE = new Color2("��");
	
	private Color2(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Color2 [name=" + name + "]";
	}
	
	
	
	
}
