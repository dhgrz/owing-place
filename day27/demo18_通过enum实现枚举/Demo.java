package com.itcast.demo18_ͨ��enumʵ��ö��;

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
			System.out.println("��ѡ������ɫ");
			break;
		case RED:
			System.out.println("��ѡ���˺�ɫ");
			break;
		case GREEN:
			System.out.println("��ѡ������ɫ");
			break;
		default:
			break;
		}
	}
}
