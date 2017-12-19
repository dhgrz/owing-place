package com.itcast.demo14_�򵥹���ģʽ;
/*
 * �򵥹���ģʽ��
 * ���﹤���ࣺ
 * 
 * ��ʽһ��Ϊÿһ�ֶ���ֱ��ṩ����
 * 	�ṩ��ȡ������ķ���
 *  �ṩ��ȡè����ķ���
 * ��ʽ���������ṩһ���������ṩһ����ǣ�ͨ����Ǳ�ʾ��Ҫ�ĸ�����Ȼ���ҷ����ĸ�����
 */
public class AnimalFactory {
	//********��ʽһ*************//
	public static Dog getDog(){
		return new Dog();
	}
	public static Cat getCat(){
		return new Cat();
	}
	//********��ʽ��*************//
	public static Object getAnimal(String type){
		if(type.equals("��")){
			return new Dog();
		}
		if(type.equals("è")){
			return new Cat();
		}
		return null;
	}
}
