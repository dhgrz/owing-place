package com.itcast.demo02_转换输出流OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * 转换输出流：OutputStreamWriter:
 * 构造函数：
 * 	public OutputStreamWriter(OutputStream out)：使用默认编码。接收字节流OutputStream（抽象）对象。我们学过的FileOutputStream
	public OutputStreamWriter(OutputStream out,String charsetName):charsetName指定字符集；
   写入数据：
    void write(char[] cbuf)：写入字符数组。 
	void write(char[] cbuf, int off, int len)： 写入字符数组的某一部分。 
 	void write(int c)：写入单个字符。 
 	void write(String str)：写入字符串。 ---使用最方便的
 	void write(String str, int off, int len) ：写入字符串的某一部分。 

 */
public class Demo {
	public static void main(String[] args) {
		//1.构造一个OutputStreamWriter.
		try {
			//文件可以不存在；
		//	OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("a.txt"));
			OutputStreamWriter out= new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
			//2.写入数据
			out.write("Hello中国！！！！！！");
			//3.刷新/关闭流
		//	out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
