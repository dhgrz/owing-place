package com.itcast.demo03_Ϊ��������¼�;
/*
 * �¼�������ƣ�
 * 1.�¼�Դ��Frame
 * 2.���ܻᷢ��ʲô�£��ܶ࣬������ж����ˡ�java.awt.event.XxxxxListener
 * 3.����ĳЩ�£�������ô����
 * 	   1).ʲô�£��������עһ�£����屻�ر�ʱ����Ҫ��һЩ���飬����ѡ�񣺴����¼���WindowListener
 * 	   2).��������ˣ�������ô����ʵ��WindowListerer�ӿڣ���д������Ҫ��ע������
 * 4.�¼����������¼�Դ1���¼�����ķ���3���й�����ע���¼���
 * 		myFrame.addWindowListener(new MyWindowListener());
 * 
 * ���е�ʱ����ô�ҵ��Ĵ���ķ�����
 * 1.����Ļ�ϵĴ����ϵ�X�������ť��
 * 2.�� ��Ϣ�ᱻ"����ϵͳ"���գ��¼��������ĳ��λ�õ����һ��
 * 3.����ϵͳҪ�ҵ������¼��ĳ���˭�ǵ�ǰ��ĳ�����Java����Ȼ���¼����͸�Java�����
 * 4.Java��������յ��¼���
 * 	    1).��˭�ǵ�ǰ��Ĵ��塣myFrame
 * 		2).��֤���Ƿ�ϣ����������¼������Ƿ�addWindowListener�ˣ��ǵġ�
 *  	3).���㴦��ķ�������MyWindowListener�е�windowClosing()��������
 *  	4).ִ��windowClosing������
 *   
 */
import java.awt.Frame;

public class Demo {
	public static void main(String[] args) {
		//1.ʵ����һ��Frame;
		Frame myFrame = new Frame();
		//2.�趨��С��λ�ã�
		myFrame.setSize(600,400);//��С
		myFrame.setLocation(300,200);//λ�ã�x = 200,y = 200
		//3.�趨����
		myFrame.setTitle("HelloWorld--�����ҵĵ�һ������");
		
		//**********�¼�����************//
		myFrame.addWindowListener(new MyWindowListener());
		//4.��Ϊ�ɼ���
		myFrame.setVisible(true);
	}
}
