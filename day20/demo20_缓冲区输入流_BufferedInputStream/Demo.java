package com.itcast.demo20_缓冲区输入流_BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 缓冲区输入流：BufferedInputStream
 * 
 * 构造方法：
 * public BufferedInputStream(InputStream in)：
 * 
 * 对于BufferedInputStream和BufferedOutputStream的使用
 * 同FileInputStream和FileOutputStream的使用是一样的。没有新增其它的方法；
 * 但是：效率要高很多；
 * 
 * 所以，对于字节的输入、输出流，推荐使用：BufferedInputStream和BufferedOutputStream
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			BufferedInputStream in = new BufferedInputStream(
										new FileInputStream("buf.txt"));
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				System.out.println(new String(byteArray,0,len));
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
