package com.itcast.demo18_通过enum实现枚举;

public class Demo {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println("c1 = " + c1);
		
		System.out.println("--------------");
		Color2 c2 = Color2.BLUE;
		System.out.println("c2 = " + c2);
		
		System.out.println("--------------------------------------");
		Color3 c3 = Color3.GREEN;
		System.out.println(c3);//toString()
		c3.show();
		
		switch (c3) {
		case BLUE:
			System.out.println("你选择了蓝色");
			break;
		case RED:
			System.out.println("你选择了红色");
			break;
		case GREEN:
			System.out.println("你选择了绿色");
			break;
		default:
			break;
		}
	}
}
