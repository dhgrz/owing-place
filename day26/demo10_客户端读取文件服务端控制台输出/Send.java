package com.itcast.demo10_�ͻ��˶�ȡ�ļ�����˿���̨���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 */
public class Send {
	public static void main(String[] args) {
		//1.�ļ���������
		try {
			BufferedReader fileIn = new BufferedReader(new FileReader("test09.txt"));
			//2.����Socket
			Socket socket = new Socket("192.168.21.205",8887);
			//3.��ȡ�����˵������
			/*OutputStream netOut = socket.getOutputStream();
			//4.���ļ�
			String row = null;
			while((row = fileIn.readLine()) != null){
				netOut.write(row.getBytes());
				netOut.flush();
				
			}*/
			BufferedWriter netOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//4.���ļ�
			String row = null;
			while((row = fileIn.readLine()) != null){
				netOut.write(row);
				netOut.newLine();
				netOut.flush();
				System.out.println("���ͣ�" + row);
				
			}
			//5.�ͷ���Դ
			netOut.close();
			socket.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
