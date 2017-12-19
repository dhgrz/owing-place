package com.itcast.demo05_使用打印流复制文本;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 使用打印流复制文本：
 * 
 * 1.要复制，需要读取、写入；
 * 2.打印流只能写入，不能读取。读取：BufferedReader
 * 
 * 3.读取：BufferedReader
 * 	   写入：PrintWriter
 */
public class Demo {
	public static void main(String[] args) {
		//1.读取流
		try {
			BufferedReader in = new BufferedReader(new FileReader("printWriter_test.txt"));
			//2.输出流
			PrintWriter out = new PrintWriter("copy.txt");
			
			//3.开始复制
			String row = null;
			while((row = in.readLine()) != null){
			//	out.write(row);
			//	out.write("\r\n");
				
				out.println(row);//print() + newLine()
			}
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
