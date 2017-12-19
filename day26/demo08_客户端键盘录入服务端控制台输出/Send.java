package com.itcast.demo08_�ͻ��˼���¼�����˿���̨���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * �ͻ��˴��룺
 * 
 * 1.�ӿ���̨�������룻
 * 2.����Socket;
 * 3.��ȡ�������������������ݣ�
 * 4.���û�����886����
 */
public class Send {
	public static void main(String[] args) {
		//1.�ӿ���̨��������
		BufferedReader conIn = new BufferedReader(new InputStreamReader(System.in));
		//2.����Socket
		try {
			Socket socket = new Socket("192.168.21.205",8888);
			//3.����Socket�����
			OutputStream netOut = socket.getOutputStream();
			String row = "";
			while(true){
				row = conIn.readLine();
				//����������
				netOut.write(row.getBytes());
				netOut.flush();
				if(row.equals("886")){
					break;
				}
			}
			//�ͷ���Դ
			netOut.close();
			socket.close();
			conIn.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
