package com.itcast.demo13_练习_使用字符流复制文本文件的5种方式;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符流复制文本文件的5种方式：
 * 
 * 1.基本的字符流：
 * 		FileReader
 * 		FileWriter
 * 	 	1).一次读取一个字符；method1();
 * 	 	2）.一次读取一个字符数组；method2();
 * 2.带缓冲区的字符流：
 * 		BufferedReader
 * 		BufferedWriter
 * 		1.一次读取一个字符:method3();
 * 		2.一次读取一个字符数组；:method4();
 * 		3.一次读取一个字符串；method5();
 * 
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("a.txt");
		File destFile = new File("k.txt");
		try {
		//	method1(srcFile,destFile);
		//	method2(srcFile,destFile);
		//	method3(srcFile,destFile);
		//	method4(srcFile,destFile);
			method5(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("复制完毕！");
	}
	//使用带缓冲区的字符流，一次读写一行字符串
	private static void method5(File srcFile, File destFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		//复制：一次读写一行字符串
		String row = null;
		while((row = in.readLine()) != null){
			out.write(row);
			out.newLine();
			out.flush();
		}
		in.close();
		out.close();
	}

	//使用带缓冲区的字符流，一次读写一个字符数组
	private static void method4(File srcFile, File destFile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		//复制：一次复制一个字符数组
		char[] charArray = new char[1024];
		int len = 0;
		while((len = in.read(charArray))!= -1){
			out.write(charArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}

	//使用带缓冲区的字符流，一次读写一个字符
	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(destFile));
		
		//复制：一次读写一个字符
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		//释放资源
		in.close();
		out.close();
		
		
	}
	//使用基本字符流，一次读写一个字符数组；
	private static void method2(File srcFile, File destFile) throws IOException {
		FileReader in = new FileReader(srcFile);
		FileWriter out = new FileWriter(destFile);
		
		//复制：一次读写一个字符数组
		char[] charArray = new char[1024];
		int len = 0;
		while((len = in.read(charArray)) != -1){
			//写出：一次写出一个字符数组
			out.write(charArray, 0, len);
			out.flush();
		}
		in.close();
		out.close();
	}
	//使用基本字符流，一次读写一个字符：
	private static void method1(File srcFile, File destFile) throws IOException {
		FileReader in = new FileReader(srcFile);
		FileWriter out = new FileWriter(destFile);
		
		//复制，一次读写一个字符
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		//释放资源
		in.close();
		out.close();
		
		
		
	}

	
}
