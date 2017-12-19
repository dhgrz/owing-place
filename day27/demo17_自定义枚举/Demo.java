package com.itcast.demo17_自定义枚举;
/*
 * 单例模式：程序运行期间，某些类的实例只能有一个；
 * 多例模式：程序运行期间，只能有固定数量的对象个数：例如扑克牌，只能有54个扑克对象；
 */
public class Demo {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println("c1 = " + c1);//c1 = com.itcast.demo17_自定义枚举.Color@f6b7e0e
		
		Color2 c2 = Color2.BLUE;
		System.out.println("c2 = " + c2);
		Color2 c3 = Color2.GREEN;
		System.out.println("c3 = " + c3);
		
		Color3 c4 = Color3.BLUE;
		System.out.println("c4 = " + c4);
		Color3 c5 = Color3.RED;
		System.out.println("c5 = " + c5);
	}

}
