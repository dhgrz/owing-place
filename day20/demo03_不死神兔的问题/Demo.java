package com.itcast.demo03_不死神兔的问题;

import java.util.Arrays;

/*
 * 有一对兔子，从第三个月开始，每月生一对兔子，新生的兔子，从第三个月开始，每月又生一对兔子，问20个月后，一共多少对兔子？
 * 
 * 问题描述：
 * 1:1
 * 2:1
 * 3:2
 * 4:3
 * 5:5
 * 6:8
 * ...
 * ...
 * 找规律：
 * 从第3个月开始，每月的兔子数是前两个月兔子数的和
 * 
 * 推算到第20个月就可以了：
 * 
 * 计算方式一：使用数组：
 * 1,1,2,3,5,8,13...
 * 计算方式二：使用两个相邻的变量：a = 1 , b = 1
 * 1 : a = 1 , b = 1;
 * 2 : a = 1 , b = 1;
 * 3 : a = 1 , b = 2
 * 4 : a = 2 , b = 3
 * 5 : a = 3 , b = 5;
 * 
 * 计算方式三：使用递归：
 */
public class Demo {
	public static void main(String[] args) {
		//方式一：使用数组：
		int[] arr = new int[20];
		//填充前两个月
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2 ;i < arr.length ; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		//遍历数组
		System.out.println(Arrays.toString(arr));//6765;
		
		//方式二：使用相邻变量
		int a = 1;
		int b = 1;
		
		for(int i = 3 ; i <= 20 ; i++){
			int temp = a;
			a = b;
			b = temp + a;
		}
		System.out.println("使用相邻变量的结果：" + b);
		
		//方式三：使用递归
		System.out.println("使用递归结果：" + fib(6));
	}
	
	public static int fib(int n){//6
		//如n是1月或2月时，就返回1对
		if(n == 1 || n == 2){
			return 1;//
		}
		return fib(n - 1) + fib(n - 2);//fib(5)  + fib(4)
	}
}
