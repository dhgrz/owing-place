package com.itcast.demo06_��׼���������_PrintStream_InputStream;

import java.io.PrintStream;

/*
 * ��׼���롢�������
 * 
 * PrintStream��InputStream
 * 
 * PrintStream = System.out
 * InputStream = System.in
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println("helloworld");
		
		PrintStream out = System.out;
		out.println(20);
		
		out.println(true);
		
		int[] arr = {2434,432,43,243};
		System.out.print("��ӡint���飺");
		System.out.println(arr);//println(Object obj):��ַ
		
		char[] ch = {'a','b','c'};
		System.out.print("��ӡchar���飺");
		System.out.println(ch);//println(char[] charArray) : abc
		
		long[] logArray = {2,3,5,5,3};
		System.out.print("��ӡlong���飺");
		System.out.println(logArray);//println(Object obj)��ַ
		
		
	}
}
