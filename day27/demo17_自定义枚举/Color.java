package com.itcast.demo17_自定义枚举;
/*
 * 将Color类作为一个多例模式：此类只能获取三个对象：三原色：红，绿，蓝
 * 
 * 1.外部也不能任意的实例化此类的对象；构造方法私有化
 * 2.提供公有数据成员，可以定义三个变量，每个变量代表一个Color对象；
 */
public class Color {
	public static final Color RED = new Color();
	public static final Color GREEN = new Color();
	public static final Color BLUE = new Color();
	private Color(){
		
	}
	
}
