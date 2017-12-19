package com.itcast.demo11_�༶�˵�;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		final String title = "�༶�˵�";
		final Frame frame = new Frame(title);
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		//************���ò˵�*************//
		MenuBar bar = new MenuBar();
		//2��Menu
		Menu fileMenu = new Menu("�ļ�");
		Menu changeMenu = new Menu("��������");
		//5��MenuItem
		MenuItem openMenuItem = new MenuItem("�򿪼��±�");
		MenuItem exitMenuItem = new MenuItem("�˳�ϵͳ");
		openMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime time = Runtime.getRuntime();
				try {
					time.exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}});
		exitMenuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		final MenuItem mItem1 = new MenuItem("�ú�ѧϰ");//����󣬱�������Ϊ���ú�ѧϰ
		final MenuItem mItem2 = new MenuItem("��������");
		final MenuItem mItem3 = new MenuItem("�ָ�����");
		
		mItem1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(mItem1.getLabel());
				
			}});
		mItem2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(mItem2.getLabel());
				
			}});
		mItem3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(title);
				
			}});
		//�����˵�
		changeMenu.add(mItem1);
		changeMenu.add(mItem2);
		changeMenu.add(mItem3);
		
		fileMenu.add(changeMenu);
		fileMenu.add(openMenuItem);
		fileMenu.add(exitMenuItem);
		
		bar.add(fileMenu);
		
		frame.setMenuBar(bar);
		
		
		//���ÿɼ�
		frame.setVisible(true);
	}

}
