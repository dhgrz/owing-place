package com.itcast.demo03_转换输入流InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 转换输入InputStreamReader:
 * 
 * 构造方法：
 * 	public InputStreamReader(InputStream in)：使用平台默认字符集解码。参数InputStream(抽象)对象，我们使用FileInputStream
	public InputStreamReader(InputStream in,String charsetName):使用指定字符集解码
   读取的方法：
    int read() ： 读取单个字符。 
 	int read(char[] cbuf) ：  将字符读入数组。 
	int read(char[] cbuf, int off, int len) ：将字符读入数组的某一部分。 
 	int read(CharBuffer target) ：试图将字符读入指定的字符缓冲区。 

 */
public class Demo {
	public static void main(String[] args) {
		//1.实例化一个InputStreamReader
		try {
			//文件必须存在，否则异常
			InputStreamReader in = new InputStreamReader(new FileInputStream("a.txt"),"GBK");//使用平台默认字符集
			
			//一次读取一个字符：可以一次读取一个中文。关键是同写入时的字符集一致
			/*int n = 0;
			while((n = in.read()) != -1){
				System.out.println("读取的字节：" + n);
				System.out.println("读取的字符：" + (char)n);//可以读取一个中文字符；
			}*/
			//一次读取一个字符数组：
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				//需要将charArray转换为字符串
				System.out.println("读取的字符：" + new String(charArray,0,len) );
			}
			in.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
