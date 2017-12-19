package com.itcast.demo13_JDK7的IO的新特性;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * 	JDK7要了解的新IO类
		Path:与平台无关的路径。
		Paths:包含了返回Path的静态方法。
			public static Path get(URI uri):根据给定的URI来确定文件路径。
		Files:操作文件的工具类。提供了大量的方法，简单了解如下方法
			public static long copy(Path source, OutputStream out) :复制文件
			public static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options):
		把集合的数据写到文件。

 */
public class Demo {
	public static void main(String[] args) throws IOException, URISyntaxException {
		/*//拷贝文件
		FileOutputStream out = new FileOutputStream("D:\\a_copy.txt");
		Files.copy(Paths.get("D:\\a.txt"), out);
		out.close();*/
		
		//将集合的数据写入到文件：
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("张三");
		strList.add("邓超");
		strList.add("郑凯");
		strList.add("王宝强");
		
		Files.write(Paths.get("D:\\file_write.txt"), strList, Charset.forName("GBK"));
		System.out.println("操作完成！");
	}
}
