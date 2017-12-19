package com.itcast.demo10_Properties类作为Map使用;

import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties类用于操作配置文件：
 * 
 * 1.它集成自Hashtable，所以Properties就是一个Map
 * 2.特有的方法：Properties中的键和值都是String类型；
 * 		public Object setProperty(String key,String value)
		public String getProperty(String key)
		public Set<String> stringPropertyNames()

 * 
 */
public class Demo {
	public static void main(String[] args) {
		//将Properties作为Map使用
		Properties pro = new Properties();
		//填充集合
		pro.put("it001", "张三");
		pro.put("it002", "李四");
		pro.put("it003", "王五");
		
		//遍历集合
		Set keySet = pro.keySet();
		
		for(Object obj : keySet){
			System.out.println("键：" + obj + " 值：" + pro.get(obj));
		}
		
		//测试Properties的特有方法：
		//setProperties(String key,String value):它相当于Map的put()方法
		Properties pro2 = new Properties();
		pro2.setProperty("it004", "章子怡");
		pro2.setProperty("it005", "邓超");
		pro2.setProperty("it006", "陈赫");
		
		//通过某个键获取值：getProperties()：它相当于Map的get()方法
		String v1 = pro2.getProperty("it005");
		System.out.println("v1 = " + v1);
		
		//遍历
		//stringPropertyNames()：它相当于Map的keySet()方法
		Set<String> keySet2 = pro2.stringPropertyNames();
		for(String s : keySet2){
			System.out.println("键：" + s + " 值：" + pro2.getProperty(s));
		}
		
		
		
		
	}
}
