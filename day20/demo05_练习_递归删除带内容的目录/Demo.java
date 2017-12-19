package com.itcast.demo05_练习_递归删除带内容的目录;

import java.io.File;

/*
 * 练习：递归删除带内容的目录：
 * 
 * 思路：
 * 1.封装初始目录：File
 * 2.获取目录下的所有文件和目录：File[] listFiles()
 * 3.遍历File[]数组；
 * 4.获取每一个File对象，判断是否是文件：
 *   是：删除；
 *   否：回到2
 */
public class Demo {
	public static void main(String[] args) {
		File file = new File("D:\\CCTV");
		deleteFiles(file);
		System.out.println("删除完毕");
	}

	private static void deleteFiles(File file) {
		//2.获取目录下所有的文件和文件夹
		File[] fileArray = file.listFiles();
		if(fileArray!=null){
			for(File f : fileArray){
				//判断是否是一个文件
				if(f.isFile()){//是
					System.out.println("删除文件：" + f.getAbsolutePath() + "--" + f.delete());
				}else{
					deleteFiles(f);
				}
			}
			//删除完文件后，删除当前目录；
			System.out.println("删除目录：" + file.getAbsolutePath() + "--" + file.delete());
		}
		
	}
}
