package com.itcast.demo03_多线程改进多个客户端上传文件案例;

public class ClientMain {

	public static void main(String[] args) {
		for(int i = 1 ;i <= 10;i++){
			new Thread(new ClientThread("D:\\ccc\\" + i + ".png")).start();
		}

	}

}
