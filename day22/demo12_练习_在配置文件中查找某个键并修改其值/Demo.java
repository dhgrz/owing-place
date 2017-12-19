package com.itcast.demo12_练习_在配置文件中查找某个键并修改其值;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 练习：在propertiesTest.properties文件中，找到一个键：it003,如果找到，将
 * 值修改为：撒贝宁
 * 
 * 思路：
 * 1.首先读取配置文件，将所有数据读取到Properties对象中；
 * 2.遍历Properties集合，查找it003,如果找到，将值修改为：撒贝宁；
 * 3.将Properties集合中的数据写入到文件中；
 * 
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		//*******读取配置文件**************//
		Properties pro = new Properties();
		Reader in = new FileReader("propertiesTest.properties");
		pro.load(in);
		in.close();
		//遍历集合，判断
		Set<String> keySet = pro.stringPropertyNames();
		for(String s : keySet){
			if(s.equals("it003")){
				//设置值
				pro.setProperty(s, "撒贝宁");
				break;
			}
		}
		//上面的代码如果找到就修改，没找到，就什么都不做；
		//将集合中再写入文件
		Writer out = new FileWriter("propertiesTest.properties");
		pro.store(out, "login");
		out.close();
		System.out.println("操作完成！");
	}
}
