package com.itcast.demo15_�ع�֮ǰ���̰߳�ȫ�Ե���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * StringBuffer:�̰߳�ȫ��Ч�ʵ�
 * StringBuilder:�̲߳���ȫ��Ч�ʸߣ�
 * 
 * List:
 * 		ArrayList:�̲߳���ȫ��Ч�ʸ�
 * 		Vector���̰߳�ȫ��Ч�ʵͣ�
 * 		LinkedList:�̲߳���ȫ��Ч�ʸ�
 * 
 *Collections �����и�������
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		List synList = Collections.synchronizedList(list);//�ܹ������ǵ��̲߳���ȫ��ArrayListת��Ϊ�̰߳�ȫ��List
		
	}
}
