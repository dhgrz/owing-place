package com.itcast.demo01_TCP����̨����Ͷ�ȡ�ı��ڷ���˿���̨��ʾ������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Clinet {
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Socket socket = new Socket("127.0.0.1",9888);
		OutputStream netOut = socket.getOutputStream();
		//*********�ӿ���̨��������***************
		/*BufferedReader conIn = new BufferedReader(new InputStreamReader(System.in));
		String row = null;
		while(true){
			row = conIn.readLine();
			System.out.println("Ҫ���͵���Ϣ��" + row);
			byte[] byteArray = row.getBytes();
			System.out.println("Ҫ���͵�byte����:" + Arrays.toString(byteArray));
			//��ͻ��˷���
			netOut.write(byteArray);
			if(row.equals("886")){
				break;
			}
		}
		*/
		//*********���ı��ļ���ȡ***********************
		BufferedReader fileIn = new BufferedReader(new FileReader("demo01.txt"));
		String row = null;
		while(true){
			row = fileIn.readLine();
			System.out.println("Ҫ���͵���Ϣ��" + row);
			byte[] byteArray = row.getBytes();
			System.out.println("Ҫ���͵�byte����:" + Arrays.toString(byteArray));
			
			//��ͻ��˷���
			netOut.write(byteArray);
			
			if(row.equals("886")){
				break;
			}
		}
		fileIn.close();
		System.out.println("�ͻ��˽�����");
		
		netOut.close();
		socket.close();
		
		
	}
}
