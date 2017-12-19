package com.itcast.demo22_将文件中的字符串中的字符排序写入另一个文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/*
 * 将s.txt中的字符串：hcexfgijk
 * 				amdnoqrzst
 * 				uvwybpl
 * 排序后写入ss.txt
 * 
 * 思路：
 * 1.读取文件
 * 2.遍历字符串，获取每个字符；
 * 3.将字符存入到一个TreeSet中就可以；
 * 4.将TreeSet中的内容写入到文件；
 */
public class Demo {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("s.txt"));
			StringBuffer buf = new StringBuffer();
			String row = null;
			while((row = in.readLine()) != null){
				buf.append(row);
			}
			in.close();
			//将StringBuffer中的字符取出
			char[] charArray = buf.toString().toCharArray();
			//准备一个TreeSet
			TreeSet<Character> set = new TreeSet<>();//目的：排序
			for(char c : charArray){
				set.add(c);
			}
			//将集合中的元素写入文件：
			BufferedWriter out = new BufferedWriter(new FileWriter("ss.txt"));
			for(Character c : set){
				out.write(c.toString());
			}
			out.close();
			System.out.println("写入完毕！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
