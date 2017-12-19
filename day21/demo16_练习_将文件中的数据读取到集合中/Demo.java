package com.itcast.demo16_练习_将文件中的数据读取到集合中;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 将文件中的数据读取到集合中。
 * 
 * 1.从文件中读取，使用字符流。BufferedReader
 * 2.准备一个装字符串的集合；
 * 3.循环读取，向集合中写入数据；
 * 4.释放资源；
 * 5.遍历集合
 */
public class Demo {
	public static void main(String[] args) {
		//1.准备一个字符流：
		try {
			BufferedReader in = new BufferedReader(new FileReader("listToFile.txt"));
			//2.准备一个装字符串的集合
			ArrayList<String> list = new ArrayList<String>();
			//3.循环读取文件
			String row = null;
			while((row = in.readLine()) != null){
				//向集合中添加元素
				list.add(row);
			}
			//4.释放资源
			in.close();
			//5.遍历集合
			for(String s : list){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
