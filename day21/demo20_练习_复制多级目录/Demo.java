package com.itcast.demo20_练习_复制多级目录;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制多级目录：
 * 
 * 从D:\\bbb   复制到 E:\\
 * 
 * 1.建立源目录：File
 * 2.建立目标目录：File
 * 3.传入到方法：
 * 4.判断源目录是一个目录么？
 * 		是：
 * 			4.1:判断目标目中是否有此目录，如果没有，创建；
 *  		4.2：获取源目录中所有的文件和目录；File[]数组
 *  		4.3:遍历File[]数组
 *  		4.4:回到3(方法的递归调用)
 * 		否：
 * 		  直接复制
 * 
 * 特别注意需要处理的地方：
 * 1.在方法内，进行递归调用时以及复制文件时，要计算出新的"源目录"和"目标目录"
 */
public class Demo {
	public static void main(String[] args) {
		File srcFile = new File("D:\\bbb");
		File destFile = new File("E:\\");
		try {
			copyFile(srcFile,destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("复制完毕！");
		
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {//srcFile-->D:\\bbb,destFile-->E:\\
		//4.判断源目录是一个目录么？
		if(srcFile.isDirectory()){//是一个目录
			//4.1:判断目标目中是否有此目录，如果没有，创建；
			destFile = new File(destFile,srcFile.getName());
			if(!destFile.exists()){
				destFile.mkdir();
				System.out.println("创建目录：" + destFile.getAbsolutePath());
			}
			//4.2：获取源目录中所有的文件和目录；File[]数组
			File[] fileArray = srcFile.listFiles();
			//4.3:遍历File[]数组
			for(File f : fileArray){//f-->D:\\bbb\\xxx   destFile --> E:\\bbb
				//4.4.获取每一个File，进行递归调用，这里注意新的"srcFile"和"destFile"
				copyFile(f,destFile);//("E:\\bbb")
			}
		}else{//是文件
			//拷贝
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
			File f = new File(destFile,srcFile.getName());
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f));
			
			byte[] byteArray =new byte[1024];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				out.write(byteArray,0,len);
				out.flush();
			}
			in.close();
			out.close();
			System.out.println("复制文件：" + srcFile.getAbsolutePath() + " 到：" + f.getAbsolutePath() + " 复制完毕！");
		}
		
	}
}
