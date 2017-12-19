package com.itcast.demo04_OutputStreamWriter的5种写入方式;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter的5种写入方式：
 * 	public void write(int c)
	public void write(char[] cbuf)
	public void write(char[] cbuf,int off,int len)
	public void write(String str)--最常用。
	public void write(String str,int off,int len)

 */
public class Demo {
	public static void main(String[] args) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("a.txt"));
			
			//1.public void write(int c)
			out.write(97);
			//2.public void write(char[] cbuf)
			char[] charArray = {'你','a','好','b',',','.','1'};
			out.write(charArray);
			//3.public void write(char[] cbuf,int off,int len)
			out.write(charArray,0,3);
			//4.public void write(String str)
			out.write("helloworld");
			//5.public void write(String str,int off,int len)
			out.write("helloworld",0,5);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
