package com.itcast.demo04_UDP接收端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 接收端：
 * 
 * 1.建立socket:DatagramSocket(int port):指定接收数据的端口号
 * 2.建立数据包；DatagramPacket(byte[] buf, int length):
 * 3.调用socket的receive()等待发送端发送数据；
 *   一旦有客户端发送过来数据，那么这个方法就会返回；
 * 4.通过DatagramPacket对象获取接收的数据：
 */
public class UDPReceive {

	public static void main(String[] args) throws IOException {
		//1.建立socket:DatagramSocket
		DatagramSocket socket = new DatagramSocket(8888);
		//2.建立一个空的数据包对象：
		byte[] byteArray = new byte[1024];
		DatagramPacket pak = new DatagramPacket(byteArray,byteArray.length);
		//3.调用socket的receive()等待发送端发送数据；一旦有客户端发送过来数据，那么这个方法就会返回；
		socket.receive(pak);//阻塞
		//4.通过DatagramPacket对象获取接收的数据：
		//接收获取对方机器IP
		String ip = pak.getAddress().getHostAddress();
		//获取信息内容
		byte[] infoArray = pak.getData();
		int infoLen = pak.getLength();
		String str = new String(infoArray,0,infoLen);
		System.out.println("接收到 IP： " + ip + " 内容：" + str);

	}

}
