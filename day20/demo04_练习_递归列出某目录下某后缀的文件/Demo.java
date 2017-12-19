package com.itcast.demo04_��ϰ_�ݹ��г�ĳĿ¼��ĳ��׺���ļ�;

import java.io.File;

/*
 * �ݹ����ָ��Ŀ¼�����е�java�ļ��ľ���·������
 * 
 * ˼·��
 * 1.��װ��ʼĿ¼��File����
 * 2.��ȡĿ¼�µ������ļ���Ŀ¼��File[] listFiles()
 * 3.����File[]���飻
 * 4.�ж�ÿ��File�Ƿ����ļ���
 *    �ǣ��ж��Ƿ���.java�ļ����ǣ���ӡ��������һ��ѭ����
 *    �񣺻ص�2
 */
public class Demo {
	public static void main(String[] args) {
		//1.��װ��ʼĿ¼
		File file = new File("D:\\20150118\\day19\\");
		listFile(file);
	}
	public static void listFile(File file){
		//2.��ȡĿ¼�����е��ļ���Ŀ¼
		File[] fileArray = file.listFiles();
		//ע�⣺�����ǰFile��������û���ļ���Ŀ¼��listFiles()�������ص���null
		//3.����
		if(fileArray!= null){
			for(File f : fileArray){
				//4.�ж��Ƿ����ļ�
				if(f.isFile() && f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}else{//��һ��Ŀ¼,�ݹ����
					listFile(f);
				}
			}
		}
	}
}
