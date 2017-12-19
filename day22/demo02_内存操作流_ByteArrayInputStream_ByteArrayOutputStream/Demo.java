package com.itcast.demo02_内存操作流_ByteArrayInputStream_ByteArrayOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 	操作字节数组
		ByteArrayInputStream:可以取出被缓存的byte数组
			构造：ByteArrayInputStream(byte[] buf)  创建一个 ByteArrayInputStream，使用 buf 作为其缓冲区数组。
			方法：read();
			
		ByteArrayOutputStream：类似于一个byte数组的缓存。可以向其中添加byte数组
			构造：ByteArrayOutputStream()：创建一个新的 byte 数组输出流。
			方法：toByteArray():获取内部的所有数据
	操作字符数组
		CharArrayReader
		CharArrayWrite
	操作字符串
		StringReader
		StringWriter

 */
public class Demo {
	public static void main(String[] args) throws IOException {
		/*FileInputStream in = new FileInputStream("a.txt");
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = in.read(byteArray))!= -1){
			//以前要么向控制台输出，要么写入另一个文件；
			//如果此时，我们什么都不能做，只是先获取数据，然后再做其它事情；
			//是不是需要把每次取到的byte数组给存起来；
		}*/
		ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
		for(int i = 1 ; i <= 10; i++){
			byteArrayOut.write(("hello" + i).getBytes());
		}
		//不需要关闭
	//	byteArrayOut.close();
		
		//取出数据：
		//1.先通过ByteArrayOutputStream获取一个byte数组
		byte[] byteArray = byteArrayOut.toByteArray();
		//2.使用ByteArrayInputStream读取数组数据：
		ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArray);
		int n = 0;
		while((n = byteArrayIn.read()) != -1){
			System.out.println((char)n);
		}
		
	}
}
