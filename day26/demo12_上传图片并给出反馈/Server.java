package com.itcast.demo12_上传图片并给出反馈;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		//2.等待客户端连接
		Socket clientSocket = server.accept();
		//3.获取输入流
		InputStream netIn = clientSocket.getInputStream();
		//4.文件的输出流
		FileOutputStream fileOut = new FileOutputStream("copy_img.ico");
		//5.读取网络数据，写入文件
		byte[] byteArray = new byte[1024];
		int len = 0;
		while((len = netIn.read(byteArray))!=-1){
			fileOut.write(byteArray,0,len);
			fileOut.flush();
		}
		System.out.println("服务端拷贝完成");
		//向客户端给出反馈
		//获取网络输出流
		/*OutputStream netOut = clientSocket.getOutputStream();
		netOut.write("上传成功！".getBytes());
		netOut.flush();*/
		
		//6.释放资源
		fileOut.close();
		netIn.close();
		clientSocket.close();
		server.close();
		
	}
}
