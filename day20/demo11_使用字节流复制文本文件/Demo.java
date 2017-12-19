package com.itcast.demo11_使用字节流复制文本文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用字节流复制文本文件：
 * 
 * 思路：
 * 
 * 1.复制：读取一个文件的内容，然后向另一个文件写入；
 * 2.读取：FileInputStream       ---      a.txt
 * 			一次读一个字节
 * 			
 *   写入：FileOutputStream      ---      b.txt
 *   		一次写入一个字节
 */
public class Demo {
	public static void main(String[] args) {
		
		try {
			//输入流：文件必须存在；
			FileInputStream in = new FileInputStream("a.txt");
			//准备一个输出流：文件可以不存在
			FileOutputStream out = new FileOutputStream("b.txt");
			//开始复制：
			//输入流：一次读取一个字节
			//输出流：一次写入一个字节
			int n = 0;
			while((n = in.read())!= -1){
				out.write(n);
			}
			//是否资源
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
