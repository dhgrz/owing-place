package com.itcast.demo11_多级菜单;

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
		final String title = "多级菜单";
		final Frame frame = new Frame(title);
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		//************设置菜单*************//
		MenuBar bar = new MenuBar();
		//2个Menu
		Menu fileMenu = new Menu("文件");
		Menu changeMenu = new Menu("更改名称");
		//5个MenuItem
		MenuItem openMenuItem = new MenuItem("打开记事本");
		MenuItem exitMenuItem = new MenuItem("退出系统");
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
		final MenuItem mItem1 = new MenuItem("好好学习");//点击后，标题栏变为：好好学习
		final MenuItem mItem2 = new MenuItem("天天向上");
		final MenuItem mItem3 = new MenuItem("恢复标题");
		
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
		//关联菜单
		changeMenu.add(mItem1);
		changeMenu.add(mItem2);
		changeMenu.add(mItem3);
		
		fileMenu.add(changeMenu);
		fileMenu.add(openMenuItem);
		fileMenu.add(exitMenuItem);
		
		bar.add(fileMenu);
		
		frame.setMenuBar(bar);
		
		
		//设置可见
		frame.setVisible(true);
	}

}
