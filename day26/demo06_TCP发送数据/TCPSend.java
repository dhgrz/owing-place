package com.itcast.demo06_TCP发送数据;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP发送数据：
 * 
 * 1.建立Socket:Socket(String ip , int port);
 * 2.同过socket对象，获取一个OutputStream输出流；
 * 3.通过OutputStream向接收端发送数据；
 * 4.释放资源
 * 
 * 注意：TCP是面向连接的。
 * 所以必须是"接收端"先启动，如果发送端先启动，则异常。
 */
public class TCPSend {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//1.建立Socket:Socket(String ip , int port);
		Socket socket = new Socket("192.168.21.205",8888);
		//2.同过socket对象，获取一个OutputStream输出流；
		OutputStream netOut = socket.getOutputStream();
		
		//3.通过OutputStream向接收端发送数据；
		netOut.write("你好，这是通过TCP发送的数据".getBytes());
	//	netOut.close();//事先不要关闭
		//1.获取InputStream
		InputStream netIn = socket.getInputStream();
		byte[] byteArray = new byte[1024];
		System.out.println("客户端等待反馈......");
		int len = netIn.read(byteArray);
		String str = new String(byteArray,0,len);
		System.out.println("客户端接收到反馈：" + str);
	
		
		netIn.close();
		//4.释放资源；
		
		socket.close();
		System.out.println("发送完毕！");
		
		
		
		
		
	}
}
