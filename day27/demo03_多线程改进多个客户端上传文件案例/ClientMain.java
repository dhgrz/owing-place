package com.itcast.demo03_���̸߳Ľ�����ͻ����ϴ��ļ�����;

public class ClientMain {

	public static void main(String[] args) {
		for(int i = 1 ;i <= 10;i++){
			new Thread(new ClientThread("D:\\ccc\\" + i + ".png")).start();
		}

	}

}
