package com.itcast.demo17_练习_随机获取文件中的姓名;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 练习：随机获取文件中的姓名：
 * 
 * 1.将文件中的姓名读取到程序中；
 * 2.然后随机获取一个姓名；(点名器)
 * 
 * 思路：
 * 
 * 1.字符输入流：BufferedReader
 * 2.准备一个集合ArrayList<String>
 * 3.循环获取文件内容，写入到集合；
 * 4.释放资源；
 * 5.使用Random对象产生一个索引：范围：0 -- 集合.size()
 * 6.通过索引获取集合中的元素；
 */
public class Demo {
	public static void main(String[] args) {
		try {
			//1.准备一个输入流
			BufferedReader in = new BufferedReader(new FileReader("listToFile.txt"));
			//2.准备一个集合
			ArrayList<String> nameList = new ArrayList<String>();
			//3.获取文件内容，填充集合
			String row = null;
			while((row = in.readLine()) != null){
				nameList.add(row);
			}
			//4.释放资源
			in.close();
			//5.使用Random对象产生一个索引：范围：0 -- 集合.size()
			Random rdo = new Random();
			int index = rdo.nextInt(nameList.size());//0 -- 集合.size()
			System.out.println("随机抽取的人名：" + nameList.get(index));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
