package com.itcast.demo05_��ϰ_�ݹ�ɾ�������ݵ�Ŀ¼;

import java.io.File;

/*
 * ��ϰ���ݹ�ɾ�������ݵ�Ŀ¼��
 * 
 * ˼·��
 * 1.��װ��ʼĿ¼��File
 * 2.��ȡĿ¼�µ������ļ���Ŀ¼��File[] listFiles()
 * 3.����File[]���飻
 * 4.��ȡÿһ��File�����ж��Ƿ����ļ���
 *   �ǣ�ɾ����
 *   �񣺻ص�2
 */
public class Demo {
	public static void main(String[] args) {
		File file = new File("D:\\CCTV");
		deleteFiles(file);
		System.out.println("ɾ�����");
	}

	private static void deleteFiles(File file) {
		//2.��ȡĿ¼�����е��ļ����ļ���
		File[] fileArray = file.listFiles();
		if(fileArray!=null){
			for(File f : fileArray){
				//�ж��Ƿ���һ���ļ�
				if(f.isFile()){//��
					System.out.println("ɾ���ļ���" + f.getAbsolutePath() + "--" + f.delete());
				}else{
					deleteFiles(f);
				}
			}
			//ɾ�����ļ���ɾ����ǰĿ¼��
			System.out.println("ɾ��Ŀ¼��" + file.getAbsolutePath() + "--" + file.delete());
		}
		
	}
}
