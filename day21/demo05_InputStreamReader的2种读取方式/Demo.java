package com.itcast.demo05_InputStreamReader的2种读取方式;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader的两种读取方式：
 * 
 * 	public int read()：根据字符集，一次读取一个字符；
	public int read(char[] cbuf)：一次读取一个字符数组；

 */
public class Demo {
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"));
			//1.	public int read()：根据字符集，一次读取一个字符；
			/*int n = in.read();
			System.out.println("读取的字节：" + n);
			System.out.println("读取的字符：" + (char)n);*/
			
			/*int n = 0;
			while((n = in.read()) != -1){
				System.out.println("读取的字符：" + (char)n);
			}*/
			
			//2.public int read(char[] cbuf)：一次读取一个字符数组；
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray))!= -1){
				System.out.println(new String(charArray,0,len));
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//使用平台默认字符集
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
