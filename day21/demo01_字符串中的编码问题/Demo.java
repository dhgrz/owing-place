package com.itcast.demo01_字符串中的编码问题;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 字符串中的编码问题：
 * 
 * 在String类中，有可以进行编码和解码的方式：
 * 
 * 1.编码：把看得懂的变成看不懂的
 * 		String.getBytes()  -->    byte[](编码后的一个数组)
 * 	 ------------------------------------------------------
 * 	 byte[] getBytes() ：使用平台默认的字符集将此 String 解码为字节序列，并将结果存储到一个新的字节数组中。 
 	 byte[] getBytes(String charsetName): 使用指定的字符集将此 String 解码为字节序列，并将结果存储到一个新的字节数组中。 
 	 
   2.解码：把看不懂的变成看得懂的
   		byte[]    --> String
     -------------------------------------------------------
                通过String类的构造函数：
     String(byte[] bytes, int offset, int length, String charsetName）: 构造一个新的 String，方法是使用指定的字符集解码字节的指定子数组。 
	 String(byte[] bytes, String charsetName):构造一个新的 String，方法是使用指定的字符集解码指定的字节数组。 
	 
   导致乱码：通常是由于编码与解码的方式不一致；
   
   解决方法：只要保证编码和解码保持一致，就不会出现乱码。
 */
public class Demo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String str = "aacc";
	//	byte[] byteArray = str.getBytes();//编码过程。GBK
		byte[] byteArray = str.getBytes("UTF-8");//编码过程。UTF-8
		System.out.println("编码后的：" + Arrays.toString(byteArray));
		
		//解码：对之前的byteArray解码
	//	String resultStr = new String(byteArray);//解码。GBK
		String resultStr = new String(byteArray,"UTF-8");
		System.out.println("解码后的字符串：" + resultStr);
		
	}
}
