package com.itcast.demo12_上传图片并给出反馈;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.建立Socket
		Socket socket = new Socket("192.168.21.205",8888);
		//2.建立文件的输入字节流
		FileInputStream fileIn = new FileInputStream("D:\\3000soft.ico");
		//3.获取socket的输出流
		OutputStream netOut = socket.getOutputStream();
		//4.读取文件并向服务器上传
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = fileIn.read(byteArray))!= -1){
			netOut.write(byteArray,0,len);
			netOut.flush();
		}
		//接收服务端反馈
		/*InputStream netIn = socket.getInputStream();
		byte[] byteArray2 = new byte[1024];
		int len2 = 0;
		while((len2 = netIn.read(byteArray2))!= -1){
			String str = new String(byteArray2,0,len2);
			System.out.println("接收到服务端反馈：" + str);
		}
		int len2 = netIn.read(byteArray2);
		String str = new String(byteArray2,0,len2);
		System.out.println("接收到服务端反馈：" + str);*/
		System.out.println("上传完毕");
		//5.释放资源
		netOut.close();
		fileIn.close();
		socket.close();
		
	}
}
