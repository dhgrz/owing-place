package com.itcast.demo18_��ϰ_���Ƶ����ļ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ��У�
 * 
 * ˼·��
 * 1.��װԴĿ¼��File;
 * 2.��װĿ�ĵ�Ŀ¼��File;
 * 	  �ж�Ŀ�ĵ�Ŀ¼�Ƿ���ڣ���������ڣ�����һ����
 * 3.��ȡԴĿ¼�µ������ļ���File[]
 * 4.����File[]���飻
 * 5.�������롢����������и��ƣ�ʹ���ֽ�����BufferedInputStream��BufferedOutputStream
 * 6.�ͷ���Դ��
 * 7.ѭ������
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
		
		System.out.println("������ϣ�");
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {//D:\aaa,dest:e:\
		//�ж�Ŀ�ĵ�Ŀ¼�Ƿ����:File(Flie f , String child);
		destFile = new File(destFile,srcFile.getName());//E:\ , "aaa"
		if(!destFile.exists()){
			//����Ŀ¼
			destFile.mkdir();
		}
		//3.��ȡԴĿ¼�µ������ļ���File[]
		File[] fileArray = srcFile.listFiles();
		for(File f : fileArray){
			BufferedInputStream in = new BufferedInputStream(
										new FileInputStream(f));//����Դ:d:\\aaa\\a.txt
			//Ϊ�˷����ӡ����File���������棺
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
			
			System.out.println("�����ļ����ӣ�" + f.getAbsolutePath() + " ����" + newFile.getAbsolutePath() + " ������ϣ�");
			
		}
			
		
	}
}
