package com.itcast.demo12_复制文件_使用缓冲区字符流一次读写一行数据;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文件_使用缓冲区字符流一次读写一行数据;
 */
public class Demo {
	public static void main(String[] args) {
		//1.实例化输入、输出流
		try {
			BufferedReader in = new BufferedReader(new FileReader("f.txt"));
			BufferedWriter out =  new BufferedWriter(new FileWriter("E:\\copyRow.txt"));
			
			//一次读取一行数据
			String row = null;
			while((row = in.readLine()) != null){
				out.write(row);
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
