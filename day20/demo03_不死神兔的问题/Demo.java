package com.itcast.demo03_�������õ�����;

import java.util.Arrays;

/*
 * ��һ�����ӣ��ӵ������¿�ʼ��ÿ����һ�����ӣ����������ӣ��ӵ������¿�ʼ��ÿ������һ�����ӣ���20���º�һ�����ٶ����ӣ�
 * 
 * ����������
 * 1:1
 * 2:1
 * 3:2
 * 4:3
 * 5:5
 * 6:8
 * ...
 * ...
 * �ҹ��ɣ�
 * �ӵ�3���¿�ʼ��ÿ�µ���������ǰ�������������ĺ�
 * 
 * ���㵽��20���¾Ϳ����ˣ�
 * 
 * ���㷽ʽһ��ʹ�����飺
 * 1,1,2,3,5,8,13...
 * ���㷽ʽ����ʹ���������ڵı�����a = 1 , b = 1
 * 1 : a = 1 , b = 1;
 * 2 : a = 1 , b = 1;
 * 3 : a = 1 , b = 2
 * 4 : a = 2 , b = 3
 * 5 : a = 3 , b = 5;
 * 
 * ���㷽ʽ����ʹ�õݹ飺
 */
public class Demo {
	public static void main(String[] args) {
		//��ʽһ��ʹ�����飺
		int[] arr = new int[20];
		//���ǰ������
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2 ;i < arr.length ; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		//��������
		System.out.println(Arrays.toString(arr));//6765;
		
		//��ʽ����ʹ�����ڱ���
		int a = 1;
		int b = 1;
		
		for(int i = 3 ; i <= 20 ; i++){
			int temp = a;
			a = b;
			b = temp + a;
		}
		System.out.println("ʹ�����ڱ����Ľ����" + b);
		
		//��ʽ����ʹ�õݹ�
		System.out.println("ʹ�õݹ�����" + fib(6));
	}
	
	public static int fib(int n){//6
		//��n��1�»�2��ʱ���ͷ���1��
		if(n == 1 || n == 2){
			return 1;//
		}
		return fib(n - 1) + fib(n - 2);//fib(5)  + fib(4)
	}
}
