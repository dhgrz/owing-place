package com.itcast.demo02_InetAddress��;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * java.net.InetAddress:������һ��IP��ַ��
 * ��û�й��췽��:ʹ�þ�̬������public static InetAddress getByName(String host)
 * ��Ա������
 * 		String getHostName()����ȡ�� IP ��ַ���������� 
 * 		public String getHostAddress()������ IP ��ַ�ַ��������ı�������ʽ����
 */
public class Demo {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("Lenovo-PC");
			String hostName = add.getHostName();
			System.out.println("���������" + hostName);
			String ip = add.getHostAddress();
			System.out.println("IP:" + ip);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
