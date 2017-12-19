package com.itcast.demo08_��ϰ_����ƶ�����ť�ı䴰�屳��ɫ;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
	public static void main(String[] args) {
		final Frame frame = new Frame("�����ı�");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//���Ĳ���
		frame.setLayout(new FlowLayout());
		//**********������************//
		Button butRed = new Button("��ɫ");
		Button butGreen = new Button("��ɫ");
		Button butBlue = new Button("��ɫ");
		Button butReset = new Button("��ԭ");//��ԭΪ��ɫ
		
		butRed.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e) {
				//�ı䴰�屳��ɫ��
				frame.setBackground(Color.red);
			}
		});
		butGreen.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//�ı䴰�屳��ɫ��
				frame.setBackground(Color.GREEN);
			}
		});
		butBlue.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//�ı䴰�屳��ɫ��
				frame.setBackground(Color.BLUE);
			}
		});
		butReset.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//�ı䴰�屳��ɫ��
				frame.setBackground(Color.WHITE);
			}
		});
		//������
		frame.add(butRed);
		frame.add(butGreen);
		frame.add(butBlue);
		frame.add(butReset);
		//��ʾ����
		frame.setVisible(true);
	}
}
