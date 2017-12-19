package com.itcast.demo16_FineInputStream一次读取一个字节数组;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * FileInputStream一次读取一个字节数组：
 * public int read(byte[] b):从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 * 返回值：读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("a.txt");
			/*byte[] byteArray = new byte[20];
			int len = in.read(byteArray);
			System.out.println("读取的字节数：" + len);
			System.out.println("读取的字节内容：" + Arrays.toString(byteArray));
			//能不能将这个byte数组转换为字符串呢？String的构造方法
			String str = new String(byteArray);//使用的平台默认的字符集解码（GBK）
			System.out.println("读取的字符内容：" + str);
			//String的构造方法：public String(byte[] bytes,int offset,int length)
			str = new String(byteArray,0,len);
			System.out.println("截取后的字符内容：" + str);*/
			
			//使用循环读取
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray))!= -1){
				System.out.print(new String(byteArray,0,len,"GBK"));
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
