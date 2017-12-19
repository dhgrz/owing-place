package com.itcast.demo08_练习_鼠标移动到按钮改变窗体背景色;

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
		final Frame frame = new Frame("复制文本");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//更改布局
		frame.setLayout(new FlowLayout());
		//**********添加组件************//
		Button butRed = new Button("红色");
		Button butGreen = new Button("绿色");
		Button butBlue = new Button("蓝色");
		Button butReset = new Button("还原");//还原为白色
		
		butRed.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e) {
				//改变窗体背景色；
				frame.setBackground(Color.red);
			}
		});
		butGreen.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//改变窗体背景色；
				frame.setBackground(Color.GREEN);
			}
		});
		butBlue.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//改变窗体背景色；
				frame.setBackground(Color.BLUE);
			}
		});
		butReset.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				//改变窗体背景色；
				frame.setBackground(Color.WHITE);
			}
		});
		//添加组件
		frame.add(butRed);
		frame.add(butGreen);
		frame.add(butBlue);
		frame.add(butReset);
		//显示窗体
		frame.setVisible(true);
	}
}
