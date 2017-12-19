package com.itcast.demo03_为窗体添加事件;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	//用户试图从窗口的系统菜单中关闭窗口时调用。
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("你想关了我？");
		System.out.println("好吧，拜拜！！");
		//结束系统运行
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
