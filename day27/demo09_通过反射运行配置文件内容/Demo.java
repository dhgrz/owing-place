package com.itcast.demo09_通过反射运行配置文件内容;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) throws Exception {
		/*IStudent stu = new Student2();
		stu.show();*/
		Class aClass = Class.forName(getValue("className"));
		Object obj = aClass.getConstructor().newInstance();
		Method m1 = aClass.getMethod(getValue("methodName"));
		m1.invoke(obj, null);
	}
	//去配置文件取类名，使用key做键名
	public static String getValue(String key) throws IOException{
		Properties pro = new Properties();
		FileReader fileIn = new FileReader("student.properties");
		pro.load(fileIn);
		fileIn.close();
		return pro.getProperty(key);
		
		
	}
}	
