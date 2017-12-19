package com.itcast.demo09_带缓冲区的字符流_BufferedWriter和BufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 带缓冲区的字符流：
 * 
 * 输出流：BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * 	   构造函数：
 * 		BufferedWriter(Writer out)： 创建一个使用默认大小输出缓冲区的缓冲字符输出流。 

 * 输入流：BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取。 
 * 	 构造函数：
 * 		BufferedReader(Reader in)： 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 */
public class Demo {
	public static void main(String[] args) {
		//1.构造一个BufferedWriter
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("d.txt"));
			//写入数据：一样的具有5个写入的方法
			//这里使用写入字符串
			out.write("Hellojava中国你好");
			//3.释放资源
			out.close();
			
			//构造一个输入流
			BufferedReader in = new BufferedReader(new FileReader("d.txt"));
			//一次读取一个字符
			/*int n = in.read();
			System.out.println("读取的int值：" + n);
			System.out.println("读取的字符：" + (char)n);*/
			//一次读取一个字符数组
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				System.out.println(new String(charArray,0,len));
			}
			//释放资源
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
