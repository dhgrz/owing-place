package com.itcast.demo04_字符打印流_PrintWriter作为Writer使用;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 将PrintWriter作为Writer使用：
 * 
 * PrintWriter是Writer的子类，必然会实现Writer中的所有抽象方法；
 * 
 * 自动刷新：
 * 使用构造方法：
 * PrintWriter(OutputStream out, boolean autoFlush)：通过现有的 OutputStream 创建新的 PrintWriter。
 * PrintWriter(Writer out, boolean autoFlush) ：创建新 PrintWriter。
 * autoFlush - boolean 变量；如果为 true，则 println、printf 或 format 方法将刷新输出缓冲区
 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	PrintWriter out = new PrintWriter("printWriter_test.txt");
			//使用字符流的构造方法，并带自动刷新
			PrintWriter out = new PrintWriter(new FileWriter("printWriter_test.txt"),true);
			
			//写入数据
			/*out.write("helloworld");
			out.write("\r\n");
			out.write(97);*/
			
			//println()如果构造时指定了自动刷新，此方法将自动刷新缓冲区；
			out.println(true);//print() + newLine() + flush()
			
			out.println(100000);
			out.println(2.3);
			
			//print方法不会自动刷新缓冲区；
			out.print(false);
			out.print(20);
			out.print(0.0);
			
			out.flush();
			
			
			//释放资源
		//	out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
