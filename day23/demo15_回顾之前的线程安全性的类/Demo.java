package com.itcast.demo15_回顾之前的线程安全性的类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * StringBuffer:线程安全，效率低
 * StringBuilder:线程不安全，效率高；
 * 
 * List:
 * 		ArrayList:线程不安全，效率高
 * 		Vector：线程安全，效率低；
 * 		LinkedList:线程不安全，效率高
 * 
 *Collections 类中有个方法：
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		List synList = Collections.synchronizedList(list);//能够将我们的线程不安全的ArrayList转换为线程安全的List
		
	}
}
