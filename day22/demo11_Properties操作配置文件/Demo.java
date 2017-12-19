package com.itcast.demo11_Properties操作配置文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * Properties类操作配置文件：使用此类操作配置文件是非常方便，不用自己去一行一行的去读，还得一行一行的解析；
 * 	public void load(Reader reader)：读取
	public void store(Writer writer,String comments)：写入

 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	write();
			read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("操作完毕！");
	}

	private static void read() throws IOException {
		Properties pro = new Properties();
		//读取，使用：load
		Reader in = new FileReader("propertiesTest.properties");
		
		//load
		pro.load(in);//从in中读取文件内的内容，并且分解每一行的数据，然后存储到Properties中
		
		//遍历Properties
		Set<String> keySet = pro.stringPropertyNames();
		for(String s : keySet){
			System.out.println("键：" + s + " 值：" + pro.getProperty(s));
		}
		
	}

	private static void write() throws IOException {
		//1.实例化一个集合：Properties
		Properties pro = new Properties();
		//2.为集合设置一些属性值，这些属性值将会写入到文件中
		pro.setProperty("it001", "章子怡");
		pro.setProperty("it002", "邓超");
		pro.setProperty("it003", "郑凯");
		
		//3.写入文件：store（）
		Writer out = new FileWriter("propertiesTest.properties");
		pro.store(out, "login");
		
		//4.关闭资源
		//不要去关闭Properties，它不是流
		out.close();
		
		
	}
}
