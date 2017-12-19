package com.itcast.demo02_InetAddress类;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * java.net.InetAddress:它代表一个IP地址；
 * 它没有构造方法:使用静态方法：public static InetAddress getByName(String host)
 * 成员方法：
 * 		String getHostName()：获取此 IP 地址的主机名。 
 * 		public String getHostAddress()：返回 IP 地址字符串（以文本表现形式）。
 */
public class Demo {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("Lenovo-PC");
			String hostName = add.getHostName();
			System.out.println("计算机名：" + hostName);
			String ip = add.getHostAddress();
			System.out.println("IP:" + ip);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
