package com.itcast.demo07_FileOutputStream写入数据;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileOutputStream写入数据：hello
 * 
 * 写入数据的方法：
 * write(byte[] b):将 b.length 个字节从指定 byte 数组写入此文件输出流中。
 * public void write(byte[] b,int off, int len)：指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
 * public void write(int b)：将指定字节写入此文件输出流。


 */
public class Demo {
	public static void main(String[] args) {
		//1.构造一个FileOutputStream
		try {
			//构造方法结束后，意味着通向文件的输出流就被打开了，可以向流中写入数据了
			FileOutputStream out = new FileOutputStream("output1.txt");
			//写入数据：
			byte[] byteArray = {97,98,99};//a,b,c
			String str = "hello";
			byte[] byteArray2 = str.getBytes();
			out.write(byteArray2);
			out.write(byteArray2,0,3);
			out.write(97);
			out.write(98);
			//模拟一下后续还有很多操作，让程序不会停止
			/*while(true){
				
			}*/
			
			//关闭资源：如果不关闭，这个管道将一直存在，一直到程序结束。
			//养成习惯，写入数据之后，立即关闭通道；
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
