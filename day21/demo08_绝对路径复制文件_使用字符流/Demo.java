package com.itcast.demo08_绝对路径复制文件_使用字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("e:\\a.txt");
			FileWriter out = new FileWriter("f:\\b.txt");
			
			//一次读取一个字符数组
			char[] charArray = new char[1024];
			int len = 0;
			while((len = in.read(charArray))!= -1){
				out.write(charArray,0,len);
				out.flush();
			}
			//释放资源：
			in.close();
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
