package com.itcast.demo16_JDK5新特性回顾;

import java.util.ArrayList;
//静态导入，直接导入静态方法
import static java.lang.Math.abs;

public class Demo {
	public static void main(String[] args) {
		//1.自动装箱、拆箱
		Integer i1 = 10;//自动装箱
		int i2 = i1;//自动拆箱
		//2.泛型
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//3.增强for循环(foreach)
		for(Integer i : intList){
			
		}
		//4.静态导入：见import部分
		//5.可变参数
		show(1);
		show(2,3,4);
		show();
		
	}
	public static void show(int ... num){
		for(int i : num){
			
		}
	}
}	
