package com.itcast.demo09_控制文本框中只接受数字;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
		// 更改布局
		frame.setLayout(new FlowLayout());
		//*********处理组件**********//
		Label lab = new Label("请输入你的QQ号码，只能输入数字，不信你试试：");
		TextField txt = new TextField(20);
		
		txt.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			//按下键的时候
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char c = e.getKeyChar();
				/*int code = e.getKeyCode();
				String s = e.getKeyText(code);
				System.out.println("你按了键盘的某个键 :KeyChar = " + c + 
										" KeyCode = " + code +
										" KeyText = " + s);*/
				
				//判断KeyChar是否是数字，如果不是，就取消事件
				if((c < '0' || c > '9')){
					
					//取消事件
					//	return;
						e.consume();
						
					
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				
				
			}});
		//
		//添加组件
		frame.add(lab);
		frame.add(txt);
		// 显示窗体
		frame.setVisible(true);
	}
}
