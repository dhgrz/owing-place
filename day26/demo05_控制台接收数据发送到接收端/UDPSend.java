package com.itcast.demo05_����̨�������ݷ��͵����ն�;
/*
 * �ӿ���̨ѭ���������ݣ�ֱ������̨�û����룺886,���߳��������
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) {
		//���տ���̨����
		BufferedReader in = new BufferedReader(
								new InputStreamReader(System.in));
		String row = "";
		try {
			//����UDP�ķ��Ͷ�
			DatagramSocket socket = new DatagramSocket();
			
			while(true){
				row = in.readLine();
				byte[] byteArray = row.getBytes();
				
				DatagramPacket pak = new DatagramPacket(byteArray,byteArray.length,
															InetAddress.getByName("Lenovo-PC"),
															8888);
				//����
				socket.send(pak);
				if(row.equals("886")){
					break;
				}
			}
			System.out.println("���������");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
