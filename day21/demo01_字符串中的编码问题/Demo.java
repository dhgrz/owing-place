package com.itcast.demo01_�ַ����еı�������;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * �ַ����еı������⣺
 * 
 * ��String���У��п��Խ��б���ͽ���ķ�ʽ��
 * 
 * 1.���룺�ѿ��ö��ı�ɿ�������
 * 		String.getBytes()  -->    byte[](������һ������)
 * 	 ------------------------------------------------------
 * 	 byte[] getBytes() ��ʹ��ƽ̨Ĭ�ϵ��ַ������� String ����Ϊ�ֽ����У���������洢��һ���µ��ֽ������С� 
 	 byte[] getBytes(String charsetName): ʹ��ָ�����ַ������� String ����Ϊ�ֽ����У���������洢��һ���µ��ֽ������С� 
 	 
   2.���룺�ѿ������ı�ɿ��ö���
   		byte[]    --> String
     -------------------------------------------------------
                ͨ��String��Ĺ��캯����
     String(byte[] bytes, int offset, int length, String charsetName��: ����һ���µ� String��������ʹ��ָ�����ַ��������ֽڵ�ָ�������顣 
	 String(byte[] bytes, String charsetName):����һ���µ� String��������ʹ��ָ�����ַ�������ָ�����ֽ����顣 
	 
   �������룺ͨ�������ڱ��������ķ�ʽ��һ�£�
   
   ���������ֻҪ��֤����ͽ��뱣��һ�£��Ͳ���������롣
 */
public class Demo {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String str = "aacc";
	//	byte[] byteArray = str.getBytes();//������̡�GBK
		byte[] byteArray = str.getBytes("UTF-8");//������̡�UTF-8
		System.out.println("�����ģ�" + Arrays.toString(byteArray));
		
		//���룺��֮ǰ��byteArray����
	//	String resultStr = new String(byteArray);//���롣GBK
		String resultStr = new String(byteArray,"UTF-8");
		System.out.println("�������ַ�����" + resultStr);
		
	}
}
