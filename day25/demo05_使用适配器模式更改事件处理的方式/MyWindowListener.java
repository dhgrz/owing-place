package com.itcast.demo05_ʹ��������ģʽ�����¼�����ķ�ʽ;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class MyWindowListener implements WindowListener {
  public class MyWindowListener extends WindowAdapter{
	//�û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á�
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("��������ң�");
		System.out.println("�ðɣ��ݰݣ���");
		//����ϵͳ����
		System.exit(0);

	}

	

}
