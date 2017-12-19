package com.itcast.demo07_练习_将文本框中的数据复制到文本域;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 将文本框中的数据移动到文本域:
 * 1.建立一个窗体；
 * 2.建立三个组件：
 * 		1).文本框：java.awt.TextField:单行文本框
 * 		2).按钮：java.awt.Button:按钮
 * 		3).文本域：java.awt.TextArea:文本域。可以设定为只读或可写；
 * 3.为按钮绑定事件处理；
 * 4.将组件添加到窗体；
 * 5.显示窗体；
 * 	
 */
public class Demo {
	public static void main(String[] args) {
		Frame frame = new Frame("复制文本");
		frame.setBounds(500, 200, 400, 300);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//更改布局
		frame.setLayout(new FlowLayout());
		//*********实例化组件*************//
		final TextField txt1 = new TextField(20);
		Button but = new Button("复制数据");
		final TextArea txtArea = new TextArea(10,50);
		//为按钮添加事件
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.获取文本框中的数据；
				String str = txt1.getText();
				//2.将数据设置到文本域中
			//	txtArea.setText(str);
				//2.将数据追加到文本域中，加换行；
				txtArea.append(str + "\r\n");
				//3.清空文本框
				txt1.setText("");
				//4.让文本框获得焦点
				txt1.requestFocusInWindow();
			}});
		//****************************//
		//添加组件
		frame.add(txt1);
		frame.add(but);
		frame.add(txtArea);
		
		frame.setVisible(true);
	}
}
