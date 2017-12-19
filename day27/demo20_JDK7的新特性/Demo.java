package com.itcast.demo20_JDK7的新特性;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	二进制字面量
	数字字面量可以出现下划线
	switch 语句可以用字符串
	泛型简化
	异常的多个catch合并
	try-with-resources 语句

 */
public class Demo {
	public static void main(String[] args) {
		//	二进制字面量
		System.out.println(0b10_10_10101);
		//数字字面量可以出现下划线
		System.out.println(12_345_678);
		
		//泛型简化
		ArrayList<Integer> intList = new ArrayList<>();
		//异常的多个catch合并
		try{
			
		}catch(ArithmeticException | NullPointerException e){
			
		};
	}
	
	public void file(){
		try (FileReader in = new FileReader("1.txt");
			 FileWriter out = new FileWriter("2.txt");){
			
			//不用释放资源。
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
