package com.itcast.demo10_һ���˵�;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
	public static void main(String[] args) {
		final Frame frame = new Frame("ֻ�������ֵ��ı���");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		//*********���ò˵�********//
		MenuBar bar = new MenuBar();//�˵���
		Menu menu = new Menu("�ļ�");//�˵�
		MenuItem nItem = new MenuItem("�˳�ϵͳ");
		//����һ�²˵�
		//��MenuItem�ŵ�Menu�У���Menu�ŵ�MenuBar�У���MenuBar�ŵ�������
		menu.add(nItem);
		bar.add(menu);
	//	frame.add(bar);//����
		frame.setMenuBar(bar);
		//Ϊ�˵������¼�����
		nItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		//���ÿɼ�
		frame.setVisible(true);
	}
}
