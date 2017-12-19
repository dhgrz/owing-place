package com.itcast.demo10_一级菜单;

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
		final Frame frame = new Frame("只接收数字的文本框");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		//*********设置菜单********//
		MenuBar bar = new MenuBar();//菜单栏
		Menu menu = new Menu("文件");//菜单
		MenuItem nItem = new MenuItem("退出系统");
		//关联一下菜单
		//将MenuItem放到Menu中，将Menu放到MenuBar中，将MenuBar放到窗体中
		menu.add(nItem);
		bar.add(menu);
	//	frame.add(bar);//不行
		frame.setMenuBar(bar);
		//为菜单设置事件处理
		nItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		//设置可见
		frame.setVisible(true);
	}
}
