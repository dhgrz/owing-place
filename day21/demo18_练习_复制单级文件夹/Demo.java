package com.itcast.demo18_练习_复制单级文件夹;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单级文件夹：
 * 
 * 思路：
 * 1.封装源目录：File;
 * 2.封装目的地目录：File;
 * 	  判断目的地目录是否存在，如果不存在，建立一个；
 * 3.获取源目录下的所有文件；File[]
 * 4.遍历File[]数组；
 * 5.建立输入、输出流，进行复制：使用字节流。BufferedInputStream和BufferedOutputStream
 * 6.释放资源；
 * 7.循环结束
 * 
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("D:\\aaa");
		File destFile = new File("E:\\");
		
		try {
			copyFile(srcFile,destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("复制完毕！");
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {//D:\aaa,dest:e:\
		//判断目的地目录是否存在:File(Flie f , String child);
		destFile = new File(destFile,srcFile.getName());//E:\ , "aaa"
		if(!destFile.exists()){
			//建立目录
			destFile.mkdir();
		}
		//3.获取源目录下的所有文件；File[]
		File[] fileArray = srcFile.listFiles();
		for(File f : fileArray){
			BufferedInputStream in = new BufferedInputStream(
										new FileInputStream(f));//拷贝源:d:\\aaa\\a.txt
			//为了方便打印，将File定义在外面：
			File newFile = new File(destFile,f.getName());
			BufferedOutputStream out = new BufferedOutputStream(
											new FileOutputStream(newFile));//new File(e:\\aaa,"a.txt")
			byte[] byteArray = new byte[1024 * 2];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				out.write(byteArray,0,len);
				out.flush();
			}
			in.close();
			out.close();
			
			System.out.println("复制文件：从：" + f.getAbsolutePath() + " 到：" + newFile.getAbsolutePath() + " 复制完毕！");
			
		}
			
		
	}
}
