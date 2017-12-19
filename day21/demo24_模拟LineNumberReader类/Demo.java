package com.itcast.demo24_模拟LineNumberReader类;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * 自定义类模拟LineNumberReader的特有功能获取每次读取数据的行号

 */
public class Demo {
	public static void main(String[] args) {
		//1.测试一下LineNumberReader类
		try {
			MyLineNumberReader in = new MyLineNumberReader("s.txt");
			String row = null;
			/*System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());
			System.out.println(in.getLineNumber());*/
			in.setLineNumber(50);
			while((row = in.readLine()) != null){
				System.out.println(in.getLineNumber() + "行：" + row);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
