package com.itcast.demo14_练习_复制图片的4种方式;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制图片的4种方式：
 * 因为复制的是图片，二进制数据，可以直接使用字节流：
 * 
 * 1.基本字节流:
 * 		FileInputStream:
 * 		FileOutputStream:
 * 		1).一次读取一个字节；	method1()
 * 		2).一次读写一个字节数组；method2()
 * 2.带缓冲区的字节流：
 * 		BufferedInputStream
 * 		BufferedOutputStream
 * 		1).一次读写一个字节：	method3()
 * 		2).一次读写一个字节数组；method4();
 *
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("cxy.bmp");
		File destFile = new File("cxy_copy4.bmp");
		try {
		//	method1(srcFile,destFile);
		//	method2(srcFile,destFile);
		//	method3(srcFile,destFile);
			method4(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("复制完毕！");
	}
	//使用带缓冲区的字节流，一次读写一个字节数组；
	private static void method4(File srcFile, File destFile) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//复制：一次读写一个字节数组
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray)) != -1){
			out.write(byteArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
	}
	//使用带缓冲区的字节流，一次读写一个字节
	private static void method3(File srcFile, File destFile) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//复制：一次读写一个字节
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		in.close();
		out.close();
		
	}
	//使用基本字节流，一次读写一个字节数组
	private static void method2(File srcFile, File destFile) throws IOException {
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		//复制：一次读写一个字节数组1
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray)) != -1){
			out.write(byteArray,0,len);
			out.flush();
		}
		in.close();
		out.close();
		
	}

	//使用基本的字节流，一次读写一个字节
	public static void method1(File src,File dest) throws IOException{
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		//开始复制，一次读写一个字节
		int n = 0;
		while((n = in.read()) != -1){
			out.write(n);
			out.flush();
		}
		in.close();
		out.close();
	}
}
