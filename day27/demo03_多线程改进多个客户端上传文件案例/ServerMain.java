package com.itcast.demo03_多线程改进多个客户端上传文件案例;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 由于客户端是多个线程同时上传，所以要求这里的main方法中的代码尽量简洁，为了等到其它客户端连接
 */
public class ServerMain {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9888);
		int fileName = 1;
		while(true){
			
			Socket socket = server.accept();
			//当有客户端连接后，这里做的事情尽量简洁，所以这里使用一个线程
			//启动线程
			new Thread(new ServerThread(socket,fileName++)).start();
		}
		
	}
}
