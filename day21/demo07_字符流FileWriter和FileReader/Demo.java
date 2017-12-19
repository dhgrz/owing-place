package com.itcast.demo07_字符流FileWriter和FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流：FileWriter 和 FileReader
 * 
 * 字符流：
 * 输出流根：Writer(抽象类)
 * 			|--OutputStreamWriter(子类，转换流)(构造：必须得有一个字节流OutputStream)
 * 					|--FileWriter(子类，字符流)(构造：File,String)(写入的方法：无，使用父类的)
 * 		    |--BufferedWriter
 * 输入流根：Reader(抽象类)
 * 			|--InputStreamReader(子类，转换流)(构造：必须得有一个字节流InputStream)
 * 					|--FileReader(子类，字符流);(构造：File,String)(读取的方法：无，使用父类的)
 * 			|--BufferedReader
 * 				
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.构造输入输出流
		try {
			//读取时，文件必须存在
			FileReader in = new FileReader("b.txt");
			//输出流，文件可以不存在
			FileWriter out = new FileWriter("c.txt");
			
			//复制
			//方式一：一次读取一个字符
			/*int n = 0;
			while((n = in.read()) != -1){
				out.write(n);
				out.flush();
			}*/
			
			//方式二：一次读取一个字符数组
			char[] charArray =new char[1024];
			int len = 0;
			while((len = in.read(charArray)) != -1){
				out.write(charArray,0,len);
				out.flush();
			}
			
			
			//释放资源
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
