package com.itcast.demo23_模拟BufferedReader的readLine功能;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 自定义一个类，模拟BufferedReader的readLine()功能：
 * 
 * BufferedReader的readLine()功能读取一行数据，不带换行标识
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.输入流，是我们自己的类
		try {
			MyBufferedReader in = new MyBufferedReader("s.txt");
			String row = null;
			while((row = in.readLine()) != null){
				System.out.println("读取到行："  + row);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
