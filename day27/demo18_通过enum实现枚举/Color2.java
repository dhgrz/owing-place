package com.itcast.demo18_ͨ��enumʵ��ö��;

public enum Color2 {
	RED("��"),GREEN("��"),BLUE("��");
	
	private String name;
	private Color2(String n){
		this.name = n;
	}
	
	@Override
	public String toString(){
		return "name = " + this.name;
	}
}
