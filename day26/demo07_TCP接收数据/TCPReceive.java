package com.itcast.demo07_TCP接收数据;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 接收端：
 * 
 * 1.建立Socket : ServerSocket(int port):
 * 2.调用Socket的accept()等待客户端连接；
 *   一旦有客户端连接，那么此方法返回，它会返回一个Socket对象
 * 3.通过此Socket对象，可以获取InputStream对象，获取发送方发送的数据
 * 4.读取数据
 * 5.释放资源：
 */
public class TCPReceive {

	public static void main(String[] args) throws IOException {
		//1.建立Socket : ServerSocket(int port):
		try {
			ServerSocket server = new ServerSocket(8888);
			
			
			System.out.println("等待客户端连接......");
			Socket clientSocket = server.accept();//等待用户连接
			System.out.println("有客户端连接成功！");
			//3.通过此Socket对象，可以获取InputStream对象，获取发送方发送的数据
			InputStream netIn = clientSocket.getInputStream();
			//4.读取数据
			byte[] byteArray = new byte[1024];
			int len = netIn.read(byteArray);
			String str = new String(byteArray,0,len);
			System.out.println("服务端接收到信息：" + str);
			System.out.println("服务端将要发送反馈......");
			//向客户端发回反馈
			//1.获取输出流。此输出流，就代表了同"连接用户"的一个输出流；
			OutputStream netOut = clientSocket.getOutputStream();
			
			netOut.write("我已收到你的信息，请放心！".getBytes());
			System.out.println("服务端反馈已经发出！");
				
				//再次接收信息
				
			//	netOut.close();
			
			//5.释放资源
			
			server.close();
			System.out.println("服务器端结束！");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
