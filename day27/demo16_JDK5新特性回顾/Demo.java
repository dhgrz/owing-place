package com.itcast.demo16_JDK5�����Իع�;

import java.util.ArrayList;
//��̬���룬ֱ�ӵ��뾲̬����
import static java.lang.Math.abs;

public class Demo {
	public static void main(String[] args) {
		//1.�Զ�װ�䡢����
		Integer i1 = 10;//�Զ�װ��
		int i2 = i1;//�Զ�����
		//2.����
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//3.��ǿforѭ��(foreach)
		for(Integer i : intList){
			
		}
		//4.��̬���룺��import����
		//5.�ɱ����
		show(1);
		show(2,3,4);
		show();
		
	}
	public static void show(int ... num){
		for(int i : num){
			
		}
	}
}	
