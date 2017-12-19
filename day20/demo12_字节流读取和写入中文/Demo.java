package com.itcast.demo12_字节流读取和写入中文;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 使用FileOutputStream写入中文：
 * write("你好".getBytes());//写入中文是，这里实际上使用的是一次写入一个byte数组；
 * 
 * int read()：读取时，一次读取一个字节，肯定拼不成一个汉字；
 * 可以一次读取一个字节数组，然后使用指定的编码去解码，就能正常显示；
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("D:\\a.txt");
			byte[] byteArray = "你".getBytes();//汉字怎样转换为byte[]数组的呢？首先：使用的是系统平台的编码：中文操作系统默认平台编码：GBK
			System.out.println("数组长度：" + byteArray.length);//2
			System.out.println("数组内容：" + Arrays.toString(byteArray));//[-60, -29]
			out.write(byteArray);
			out.close();
			
			//读取中文
			FileInputStream in = new FileInputStream("D:\\a.txt");
			int n = in.read();//一次读取一个字节，但是使用int封装
			System.out.println("读取的字节：" + n);
			System.out.println("读取的字符：" + (char)n);//196
			n = in.read();//一次读取一个字节，但是使用int封装
			System.out.println("读取的字节：" + n);
			System.out.println("读取的字符：" + (char)n);//227
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
