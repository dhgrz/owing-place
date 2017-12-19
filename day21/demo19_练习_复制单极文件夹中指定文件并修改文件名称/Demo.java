package com.itcast.demo19_��ϰ_���Ƶ����ļ�����ָ���ļ����޸��ļ�����;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ�����ָ���ļ����޸��ļ�����
 * 
 * ��D��aaa�µ�����.java�ļ���
 * ���Ƶ�E��aaa_copy�£�Ȼ������.java�ļ�������Ϊ.txt
 * 
 * 1.����������Ŀ¼��ָ���ļ��ĸ��ƣ�
 * 2.���ǳ����ڸ��Ƶ�ͬʱ���޸��ļ��ĺ�׺��
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
		//�ж�Ŀ��Ŀ¼�Ƿ���ڣ���������ھͽ���һ��
		if(!destFile.exists()){
			destFile.mkdir();
		}
		//��ȡ��ԴĿ¼�µ������ļ�������ʱ��ɸѡ�����е�.java�ļ���Ȼ�󿽱���������
		File[] fileArray = srcFile.listFiles();
		for(File f : fileArray){
			//�ж�f�Ƿ����ļ���������.java��β
			if(f.isFile() && f.getName().endsWith(".java")){
				//���п���
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
				//��ȡԭ�ļ���
				String fileName = f.getName();//Xxxx.java
				//��Դ�ļ�����.java��Ϊ.txt
				fileName = fileName.replaceAll(".java", ".txt");
				//ʹ��destFile�����ļ�������һ��File����
				File newDestFile = new File(destFile,fileName);//E:\\aaa_copy,Xxxx.txt
				//�����������
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newDestFile));
				
				byte[] byteArray = new byte[1024];
				int len = 0;
				while((len = in.read(byteArray)) != -1){
					out.write(byteArray,0,len);
					out.flush();
				}
				in.close();
				out.close();
				System.out.println("�����ļ����ӣ�" + f.getAbsolutePath() + " ����" + newDestFile + " ������ɣ�");
			}
		}
	}
}
