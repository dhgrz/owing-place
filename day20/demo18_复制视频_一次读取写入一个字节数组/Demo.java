package com.itcast.demo18_复制视频_一次读取写入一个字节数组;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制视频文件：一次读取、写入一个字节数组
 * 
 * 速度明显快于一次读取一个字节；
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("哥有老婆.mp4");
			//输出流
			FileOutputStream out = new FileOutputStream("哥有老婆_copy.mp4");
			//开始复制：一次读取写入一个字节数组
			byte[] byteArray = new byte[2048];
			int len = 0;
			while((len = in.read(byteArray))!= -1){
				//写入
				out.write(byteArray, 0, len);
			}
			//释放资源
			in.close();
			out.close();
			System.out.println("复制完毕！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
