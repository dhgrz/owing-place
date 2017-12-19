package com.itcast.demo06_标准输入输出流_PrintStream_InputStream;

import java.io.PrintStream;

/*
 * 标准输入、输出流：
 * 
 * PrintStream和InputStream
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
		System.out.print("打印int数组：");
		System.out.println(arr);//println(Object obj):地址
		
		char[] ch = {'a','b','c'};
		System.out.print("打印char数组：");
		System.out.println(ch);//println(char[] charArray) : abc
		
		long[] logArray = {2,3,5,5,3};
		System.out.print("打印long数组：");
		System.out.println(logArray);//println(Object obj)地址
		
		
	}
}
