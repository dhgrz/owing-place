package com.itcast.demo11_缓冲区流特有功能;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲区流的特有功能：
 * 1.输出流：BufferedWriter: newLine()：输出一个换行；
 * 2.输入流：BufferedReader: readLine():一次读取一行数据；如果到达行末尾，返回null
 * 
 * 实现一个复制，一次读取一行数据，一次写入一个行数据
 */
public class Demo {
	public static void main(String[] args) {
		//1.实例化输入输出流
		try {
			BufferedReader in = new BufferedReader(new FileReader("a.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("f.txt"));
			
			//一次读取一行数据，然后写入
			String row = null;
			while((row = in.readLine()) != null){
				out.write(row);
			//	out.write("\r\n");
				out.newLine();//输出一个换行符
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
