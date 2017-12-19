package com.itcast.demo09_文件写入的异常处理;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 文件写入的异常处理：
 */
public class Demo {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("output2.txt",true);
			out.write("hello".getBytes());
			
		} catch (FileNotFoundException e) {
			System.out.println("访问系统文件失败，请与系统管理员联系！");
		} catch (IOException e) {
			System.out.println("读取、写入系统文件失败，请与系统管理员联系！");
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				System.out.println("试图关闭系统文件访问流时发生异常，请与系统管理员联系！");
			}
		}
		
	}
}
