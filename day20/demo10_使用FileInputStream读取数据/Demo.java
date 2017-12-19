package com.itcast.demo10_使用FileInputStream读取数据;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节流：
 * 	输出流：OutputStresam(抽象类)
 * 			|--FileOutputStream(类)
 *  输入流：InputStream(抽象类)
 *  		|--FileInputStream(类)FileInputStream 从文件系统中的某个文件中获得输入字节。
 *  
 *  FileInputStream:
 *  构造方法：注意：建立输入流，文件必须存在，否则FileNotFoundException异常；
 *  public FileInputStream(String name) throws FileNotFoundException：通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *  public FileInputStream(File file) throws FileNotFoundException：通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 *  
 *  读取数据：
 *  1.int read():从此输入流中读取一个数据字节。返回：下一个数据字节；如果已到达文件末尾，则返回 -1。
 */
public class Demo {
	public static void main(String[] args) {
		//1.构造一个FileInputStream
		try {
			//建立输入流，文件必须存在，否则FileNotFoundException异常；
			FileInputStream in = new FileInputStream("output2.txt");
			//2.使用File构造
		//	File file = new File("output2.txt");
		//	FileInputStream in2 = new FileInputStream(file);
			//或者
		//	FileInputStream in2 = new FileInputStream(new File("output3.txt"));
			//3.读取数据：
			/*int n = in.read();
			System.out.println("读取的字节内容：" + n);
			System.out.println("读取的字符内容：" + (char)n);//h
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//e
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//l
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//l
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//o
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//\r
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//\n
			n = in.read();
			System.out.println("读取的字符内容：" + (char)n);//w
			n = in.read();
			System.out.println("读取的字节内容：" + n);//-1
			System.out.println("读取的字符内容：" + (char)n);//?
*/			//使用循环：一
			/*int n = in.read();
			while(n != -1){
				System.out.println("读取字符：" + (char)n);
				n = in.read();
			}*/
			//使用循环：二
			int n = 0;
			while((n = in.read()) != -1){
				System.out.println("读取字符：" + (char)n);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("读取数据完毕！");
		
	}
}
