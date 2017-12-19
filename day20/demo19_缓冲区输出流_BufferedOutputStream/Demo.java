package com.itcast.demo19_缓冲区输出流_BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 通过一次读取一个字节数组，大家体验到了字节数组对于读取效率的影响。
 * 这里的字节数组就相当于一个"缓存区"
 * 
 * 在Java类库中，为我们提供了字节读写的带缓存区的类：
 * 输出流：BufferedOutputStream:该类实现缓冲的输出流。
 * 输入流：BufferedInputStream
 * 
 * 输出流：BufferedOutputStream
 * 构造方法：
 * 1.public BufferedOutputStream(OutputStream out)：使用一个OutputStream来构造；
 *   实际上还是由FileOutputStream提供输出流，BufferedOutputStream提供了缓冲区；
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.构造一个对象
		 
		try {
			/*FileOutputStream fileOut = new FileOutputStream("buf.txt");
			BufferedOutputStream out = new BufferedOutputStream(fileOut);*/
			
			BufferedOutputStream out = new BufferedOutputStream(
											new FileOutputStream("buf.txt"));
			out.write("hello".getBytes());
			//带缓冲区的输出流，write()之后，一定要flush()或close()，才能将缓冲区的内如写入文件；
		//	out.flush();
			out.close();//先执行自己的flush()方法，再执行OutputStream的close()方法
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
