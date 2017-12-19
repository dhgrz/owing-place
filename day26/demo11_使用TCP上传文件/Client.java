package com.itcast.demo11_ʹ��TCP�ϴ��ļ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 1.��ȡ�ļ���
 * 2.��������˷���
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.�����ļ���
		BufferedReader fileIn = new BufferedReader(new FileReader("D:\\file_write.txt"));
		//2.����Sokcet
		Socket socket = new Socket("192.168.21.205",8888);
		//3.��ȡ�����
		BufferedWriter netOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		//4.��ȡ�ļ������������������
		String row = null;
		while((row = fileIn.readLine()) != null){
			netOut.write(row);
			netOut.newLine();
			netOut.flush();
			
		}
		//5.�ͷ���Դ
		netOut.close();
		fileIn.close();
		socket.close();
		
		
	}
}
