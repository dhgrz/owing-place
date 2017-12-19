package com.itcast.demo20_��ϰ_���ƶ༶Ŀ¼;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ƶ༶Ŀ¼��
 * 
 * ��D:\\bbb   ���Ƶ� E:\\
 * 
 * 1.����ԴĿ¼��File
 * 2.����Ŀ��Ŀ¼��File
 * 3.���뵽������
 * 4.�ж�ԴĿ¼��һ��Ŀ¼ô��
 * 		�ǣ�
 * 			4.1:�ж�Ŀ��Ŀ���Ƿ��д�Ŀ¼�����û�У�������
 *  		4.2����ȡԴĿ¼�����е��ļ���Ŀ¼��File[]����
 *  		4.3:����File[]����
 *  		4.4:�ص�3(�����ĵݹ����)
 * 		��
 * 		  ֱ�Ӹ���
 * 
 * �ر�ע����Ҫ����ĵط���
 * 1.�ڷ����ڣ����еݹ����ʱ�Լ������ļ�ʱ��Ҫ������µ�"ԴĿ¼"��"Ŀ��Ŀ¼"
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
		System.out.println("������ϣ�");
		
	}

	private static void copyFile(File srcFile, File destFile) throws IOException {//srcFile-->D:\\bbb,destFile-->E:\\
		//4.�ж�ԴĿ¼��һ��Ŀ¼ô��
		if(srcFile.isDirectory()){//��һ��Ŀ¼
			//4.1:�ж�Ŀ��Ŀ���Ƿ��д�Ŀ¼�����û�У�������
			destFile = new File(destFile,srcFile.getName());
			if(!destFile.exists()){
				destFile.mkdir();
				System.out.println("����Ŀ¼��" + destFile.getAbsolutePath());
			}
			//4.2����ȡԴĿ¼�����е��ļ���Ŀ¼��File[]����
			File[] fileArray = srcFile.listFiles();
			//4.3:����File[]����
			for(File f : fileArray){//f-->D:\\bbb\\xxx   destFile --> E:\\bbb
				//4.4.��ȡÿһ��File�����еݹ���ã�����ע���µ�"srcFile"��"destFile"
				copyFile(f,destFile);//("E:\\bbb")
			}
		}else{//���ļ�
			//����
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
			System.out.println("�����ļ���" + srcFile.getAbsolutePath() + " ����" + f.getAbsolutePath() + " ������ϣ�");
		}
		
	}
}
