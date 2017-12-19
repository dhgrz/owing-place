package com.itcast.demo20_������������_BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ��������������BufferedInputStream
 * 
 * ���췽����
 * public BufferedInputStream(InputStream in)��
 * 
 * ����BufferedInputStream��BufferedOutputStream��ʹ��
 * ͬFileInputStream��FileOutputStream��ʹ����һ���ġ�û�����������ķ�����
 * ���ǣ�Ч��Ҫ�ߺܶࣻ
 * 
 * ���ԣ������ֽڵ����롢��������Ƽ�ʹ�ã�BufferedInputStream��BufferedOutputStream
 * 
 */
public class Demo {
	public static void main(String[] args) {
		try {
			BufferedInputStream in = new BufferedInputStream(
										new FileInputStream("buf.txt"));
			byte[] byteArray = new byte[1024];
			int len = 0;
			while((len = in.read(byteArray)) != -1){
				System.out.println(new String(byteArray,0,len));
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
