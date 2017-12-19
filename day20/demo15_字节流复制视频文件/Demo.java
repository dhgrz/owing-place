package com.itcast.demo15_字节流复制视频文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制视频文件：
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//输入流：读取
			FileInputStream in = new FileInputStream("D:\\aaa\\哥有老婆.mp4");
			//输出流：写入
			FileOutputStream out = new FileOutputStream("哥有老婆.mp4");
			//复制操作
			//一次读取一个字节，一次写入一个字节
			int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
			}
			//释放资源
			in.close();
			out.close();
			System.out.println("复制完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
