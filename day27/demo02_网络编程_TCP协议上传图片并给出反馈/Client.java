package com.itcast.demo02_网络编程_TCP协议上传图片并给出反馈;
/*
 * 正常上传文件时，由于客户端的先期close()行为促成服务端的循环结束，也就是服务端的InputStream接收到-1
 * 如果在上传后，服务端要发送回馈，客户端要等待回馈信息，此时客户端不会立即关闭socket，所以，导致服务端的循环不能结束
 * 这时可以在客户端使用使用socket.shutdownOutput()方法来关闭输出流，这样能促成服务端的InputStrean接收到一个-1
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",9888);
		OutputStream netOut = socket.getOutputStream();
		FileInputStream fileIn = new FileInputStream("d:\\3000soft.ico");
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = fileIn.read(byteArray)) != -1){
			netOut.write(byteArray,0,len);
			netOut.flush();
		}
		socket.shutdownOutput();
		System.out.println("上传完毕");
		
		InputStream netIn = socket.getInputStream();
		byte[] byteArray2= new byte[1024];
		int len2 = netIn.read(byteArray2);
		String info = new String(byteArray2,0,len2);
		System.out.println("客户端接收到服务端的回馈：" + info);
		
		fileIn.close();
		socket.close();
		
	}
}
