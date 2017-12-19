package com.itcast.demo21_四种复制方式的总结以及效率的总结;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 四种复制方式：
 * 
 * 1.FileInputStream和FileOutputStream:一次读取一个字节；method1()
 * 2.FileInputStream和FileOutputStream:一次读取一个字节数组；method2()
 * 3.BufferedInputStream和BufferedOutputStream:一次读取一个字节：method3()
 * 4.BufferedInputStream和BufferedOutputStream:一次读取一个字节数组：method4();
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
	//	method1();//60376毫秒
	//	method2();//122毫秒
	//	method3();//955毫秒
		method4();//90
		long end = System.currentTimeMillis();
		System.out.println("FileInputStream一次读取一个字节复制：" + (end - start) + " 毫秒");
	}
	//FileInputStream和FileOutputStream:一次读取一个字节；method1()
	public static void method1() throws IOException{
		FileInputStream in = new FileInputStream("哥有老婆.mp4");
		FileOutputStream out = new FileOutputStream("哥有老婆2.mp4");
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
		}
		in.close();
		out.close();
		
	}
	//2.FileInputStream和FileOutputStream:一次读取一个字节数组；method2()
	public static void method2() throws IOException{
		FileInputStream in = new FileInputStream("哥有老婆.mp4");
		FileOutputStream out = new FileOutputStream("哥有老婆3.mp4");
		byte[] byteArray = new byte[1024];
		int n = 0;
		while((n = in.read(byteArray)) != -1){
			out.write(byteArray,0,n);
		}
		in.close();
		out.close();
	}
	//3.BufferedInputStream和BufferedOutputStream:一次读取一个字节：method3()
	public static void method3() throws IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("哥有老婆.mp4"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("哥有老婆4.mp4"));
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
		}
		in.close();
		out.close();
	}
	//4.4.3.BufferedInputStream和BufferedOutputStream:一次读取一个字节数组：method4();
	public static void method4() throws IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("哥有老婆.mp4"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("哥有老婆5.mp4"));
		byte[] byteArray = new byte[1024];
		int n = 0;
		while((n = in.read(byteArray)) != -1){
			out.write(byteArray,0,n);
		}
		in.close();
		out.close();
	}
}
