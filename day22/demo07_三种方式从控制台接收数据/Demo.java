package com.itcast.demo07_三种方式从控制台接收数据;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * 三种方式从控制台接收数据：
 * 
 * 1.main参数(String[] args)可以从控制台接收启动参数；
 * 2.Scanner 接收字符串，int值
 * 3.System.in
 * 		1).它返回一个InputStream类型的：BufferedInputStream。此字节流可以转换为一个缓冲的字符流
 * 		2).转换方式：
 * 			A.使用System.in字节流构造一个转换流：InputStreamReader reader = new InputStreamReader(System.in);
 * 			B.使用转换流构造一个缓冲区字符流：BufferedReader bufReader = new BufferedReader(reader);
 * 
 * 将System.out改为缓冲字符流使用：
 * 
 * 1.System.out:返回PrintStream
 * 2.使用字节流构造转换流，使用转换流构造缓冲区字符流；
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		//通过打印in对象，我们发现它是一个BufferedInputStream对象。
		System.out.println(in);//java.io.BufferedInputStream@7b2164ea
		//将in向下转型为BufferedInputStream
		BufferedInputStream bufIn = (BufferedInputStream)in;
		//一次读取一个字节
	//	int n = bufIn.read();//程序将在这里阻塞，等待用户输入；
	//	System.out.println(n);
		
		//BufferedInputStream本身没有办法一次读取一行数据；
		//我们有没有办法能够一次获取控制台的一行数据？
		//1.要想获取一行数据，readLine()方法，此方法是哪个类？BufferedReader，此类是一个字符流。
		//2.我们现在只有字节流。如果能将字节流转换为字符流，那么我们就能一次读取一行了。
		//3.这就需要转换流：InputStreamReader.
		/*InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(reader);*/
		
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		
		String row = bufReader.readLine();
		System.out.println("row = " + row);
		
		//将System.out改为缓冲区字符流
		PrintStream ps = System.out;
		//通过字节流，构造一个转换流
		OutputStreamWriter sWriter = new OutputStreamWriter(ps);
		//使用转换流，构造一个缓冲区字符流
		BufferedWriter bufWriter = new BufferedWriter(sWriter);
		
		//写成一句话
		BufferedWriter bufWriter2 = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bufWriter2.write("hello");
		bufWriter2.newLine();
		bufWriter2.write("java");
		bufWriter2.newLine();
		bufWriter2.write("world");
		bufWriter2.flush();
		
	}
}
