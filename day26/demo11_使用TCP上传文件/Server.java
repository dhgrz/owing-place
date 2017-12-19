package com.itcast.demo11_ʹ��TCP�ϴ��ļ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//1.����Socket
		ServerSocket server = new ServerSocket(8888);
		//2.�ȴ��ͻ�������
		Socket clientSocket = server.accept();
		//3.��ȡ����������װ���ַ�������
		BufferedReader netIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		//4.��ȡ����
		//5.д���ļ���Ҫ�ļ������
		BufferedWriter fileOut = new BufferedWriter(new FileWriter("copy.txt"));
		String row = null;
		while((row = netIn.readLine()) != null){
			System.out.println("��ȡ����" + row);
			fileOut.write(row);
			fileOut.newLine();
			fileOut.flush();
		}
		//5.�ͷ���Դ
		fileOut.close();
		netIn.close();
		clientSocket.close();
		server.close();
		
	}
}
