package com.itcast.demo19_练习_复制单极文件夹中指定文件并修改文件名称;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单极文件夹中指定文件并修改文件名称
 * 
 * 将D盘aaa下的所有.java文件，
 * 复制到E盘aaa_copy下，然后将所有.java文件重命名为.txt
 * 
 * 1.首先做单级目录的指定文件的复制；
 * 2.我们尝试在复制的同时，修改文件的后缀名
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("D:\\aaa");
		File destFile = new File("E:\\aaa_copy");
		
		try {
			copyFileAndRename(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copyFileAndRename(File srcFile, File destFile) throws IOException {
		//判断目标目录是否存在，如果不存在就建立一个
		if(!destFile.exists()){
			destFile.mkdir();
		}
		//获取出源目录下的所有文件，遍历时，筛选出所有的.java文件，然后拷贝并重命名
		File[] fileArray = srcFile.listFiles();
		for(File f : fileArray){
			//判断f是否是文件，并且以.java结尾
			if(f.isFile() && f.getName().endsWith(".java")){
				//进行拷贝
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
				//获取原文件名
				String fileName = f.getName();//Xxxx.java
				//将源文件名的.java改为.txt
				fileName = fileName.replaceAll(".java", ".txt");
				//使用destFile和新文件名建立一个File对象
				File newDestFile = new File(destFile,fileName);//E:\\aaa_copy,Xxxx.txt
				//建立输出流；
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newDestFile));
				
				byte[] byteArray = new byte[1024];
				int len = 0;
				while((len = in.read(byteArray)) != -1){
					out.write(byteArray,0,len);
					out.flush();
				}
				in.close();
				out.close();
				System.out.println("拷贝文件：从：" + f.getAbsolutePath() + " 到：" + newDestFile + " 拷贝完成！");
			}
		}
	}
}
