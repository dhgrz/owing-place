package com.itcast.demo06_使用字符流复制文本文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 使用字符流复制文本文件：
 * 
 * 1.读取数据：InputStreamReader	--   "a.txt"
 * 2.写入数据：OutputStreamWriter	--   "b.txt"
 */
public class Demo {
	public static void main(String[] args) {
		//1.实例化输入、输出流
		try {
			//文件必须存在
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"));
			//文件可以不存在
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("b.txt"));
			
			//一次读写一个字符
			/*int n = 0;
			while((n = in.read())!= -1){
				out.write(n);
				out.flush();
			}*/
			//一次读写一个字符数组
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray))!= -1){
				out.write(charArray,0,len);
				out.flush();
			}
			
			//释放资源：
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
