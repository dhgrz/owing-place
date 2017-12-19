package com.itcast.demo10_带缓冲区的字符流复制文本文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 带缓冲区的字符流复制文本文件：
 * 
 * 1.读取：BufferedReader  -- a.txt
 * 2.写入：BufferedWriter  -- e.txt
 * 3.一次读写一个字符，一次读写一个字符数组
 */
public class Demo {
	public static void main(String[] args) {
		//1.构造缓冲区流
		try {
			BufferedReader in = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("e.txt"));
			
			//复制
			//一次读取一个字符
			/*int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
				out.flush();
			}*/
			
			//一次复制一个字符数组
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1 ){
				out.write(charArray,0,len);
				out.flush();
			}
			
			//释放资源
			in.close();
			out.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
