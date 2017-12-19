package com.itcast.demo17_复制文件_一次读取并写入一个字节数组;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文件：一次读取并写入一个字节数组
 */
public class Demo {
	public static void main(String[] args) {
		//1.输入流
		try {
			FileInputStream in = new FileInputStream("a.txt");
			//2.输出流
			FileOutputStream out = new FileOutputStream("b.txt");
			//3.复制：一次读取一个字节数组，一次写入一个字节数组
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				//写入
				out.write(byteArray, 0, len);
			}
			//4.释放资源；
			in.close();
			out.close();
			System.out.println("复制完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
