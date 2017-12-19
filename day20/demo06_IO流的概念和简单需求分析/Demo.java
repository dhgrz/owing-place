package com.itcast.demo06_IO流的概念和简单需求分析;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * IO流：Input，Output，流：类似于水流，线性的，有方向的；
 * 
 * 分类：
 * 		字节流：
 * 			输出流：
 * 			输入流：
 * 		字符流：
 * 			输出流：
 * 			输入流：
 * 什么情况下使用哪种流：
 * 1.字节流：读写二进制文件：图片、视频文件等；也可以读写文本文件；
 * 2.字符流：读写文本文件的；
 * 
 * Java中IO流的体系结构：
 * 		字节流：
 * 			输出流：OutputStream(抽象)
 * 			输入流：InputStream(抽象)
 * 		字符流：
 * 			输出流：Writer:(抽象)
 * 			输入流：Reader:(抽象)
 * 
 * 简单的需求：向文件写入一个字符串：hello
 * 
 * 分析：
 * 1.向文件写入-->输出流-->OutputStream
 * 2.向"文件"写，OutputStream是抽象类，不能用。使用它的子类：FileOutputStream
 * 3.了解一下FileOutputStream
 *   构造方法：
 *   	1.public FileOutputStream(String name)：创建一个向具有指定名称的文件中写入数据的输出文件流。
 *   	2.public FileOutputStream(File file)：创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//如果文件不存在，就自动创建一个空文件；
			//使用的绝对路径
		//	FileOutputStream out = new FileOutputStream("D:\\day20FileTest.txt");
			//使用相对路径；在项目根目录下
		//	FileOutputStream out2 = new FileOutputStream("day20FileTest.txt");
			
			//使用File
			File file = new File("D:\\day20FileTest.txt");
			FileOutputStream out3 = new FileOutputStream(file);
			
			File file2 = new File("day20FileTest2.txt");
			FileOutputStream out4 = new FileOutputStream(file2);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
