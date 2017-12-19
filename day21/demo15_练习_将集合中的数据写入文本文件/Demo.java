package com.itcast.demo15_练习_将集合中的数据写入文本文件;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
 * 练习：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 思路：
 * 1.先创建一个集合ArrayList。填充集合(字符串)
 * 2.创建输出流：写的是文本文件，使用字符流。字符流有两种：基本字符流，和带缓冲区的字符流。我们选择使用带缓冲区的字符流：
 * 	 BufferedWriter
 * 3.遍历集合
 * 4.取出每个元素字符串，写入到文件
 * 5.关闭输出流；
 * 	 
 */
public class Demo {
	public static void main(String[] args) {
		//1.创建集合
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("王宝强");
		list.add("周润发");
		list.add("王祖蓝");
		list.add("邓超");
		list.add("陈赫");
		list.add("郑凯");
		list.add("李晨");
		list.add("杨颖");
		
		//2.创建输出流：
		try {
			BufferedWriter out = new BufferedWriter(
									new FileWriter("listToFile.txt"));
			//3.遍历集合
			for(String s : list){
				//4.写入文件
				out.write(s);
				out.newLine();
				out.flush();
			}
			//4.释放资源
			out.close();
			System.out.println("写入完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
