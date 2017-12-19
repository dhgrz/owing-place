package com.itcast.demo08_随机访问流_RandomAccessFile类;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * java.io.RandomAccessFile类：随机访问流：
 * 
 * 1.此类的实例支持对随机访问文件的读取和写入。
 * 2.RandomAccessFile类不属于流，是Object类的子类。
 * 3.它融合了InputStream和OutputStream的功能。支持对随机访问文件的读取和写入。
 * 
 * 常用方法：
 * 1.writeXxxx()
 * 2.readXxxx()
 * 3.getFilePointer():获取当前的文件指针的偏移量
 * 4.seek():设置当前文件指针的偏移量；
 */
public class Demo {
	public static void main(String[] args) {
		try {
		//	write();
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("执行完毕！");
	}

	private static void read() throws IOException {
		RandomAccessFile accFile = new RandomAccessFile("access.txt","rw");
		//读取数据
		System.out.println("开始的偏移量:" + accFile.getFilePointer());//0
		int n = accFile.readInt();//int占有的空间为4个字节
		System.out.println("读完int后的偏移量：" + accFile.getFilePointer());//4
		char c = accFile.readChar();
		System.out.println("读完char后的偏移量：" + accFile.getFilePointer());//6
		String s = accFile.readUTF();//一个UTF编码的字符占3个字节，尤其对于汉字
		System.out.println("读完UTF后的偏移量：" + accFile.getFilePointer());//2 + 3//打印的是：11
		System.out.println("int值为：" + n + " char值为：" + c + " UTF值：" + s);
		
		accFile.seek(4);
		char cc = accFile.readChar();
		System.out.println("设置文件指针后，尝试读取字符：" + cc);
	}

	private static void write() throws IOException {
		RandomAccessFile accFile = new RandomAccessFile("access.txt","rw");
		accFile.writeInt(100);
		accFile.writeChar('a');
		accFile.writeUTF("中");
		
		accFile.close();
		
	}
}
