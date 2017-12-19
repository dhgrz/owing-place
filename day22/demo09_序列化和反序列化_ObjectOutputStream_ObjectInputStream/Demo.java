package com.itcast.demo09_���л��ͷ����л�_ObjectOutputStream_ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ���л��ͷ����л���
 * 
 * 1.���л�����ObjectOutputStream:�����Խ�һ������д�뵽�ı��ļ��У�����ͨ�����紫�䣻
 * 2.�����л�����ObjectInputStream:�����Խ�һ�����л��Ķ������л���
 * 
 * ע�⣺
 * 1.��Ҫ�����л��Ķ������ʵ��java.io.Serializable�ӿڣ�
 * 2.Serializable�ӿ�û���κη�����û���κη����Ľӿڣ��У���ǽӿڡ�
 * 3.һ����Ķ������л��󣬿��ܻᱻ���ģ�����������ĺ��ٷ����л��������׳�java.io.InvalidClassException�쳣��
 *   �����������Ҫ�����л����������serialVersionUID�������˱�����������л��Ķ����ֵ��ͬ������Ϊ����ͬ�汾�ġ�
 * 
 */
public class Demo {
	public static void main(String[] args) {
		//1.���л�
	//	Student stu = new Student("����",20,'��');
		try {
			/*ObjectOutputStream out = new ObjectOutputStream(
										new FileOutputStream("ObjectOutputStream.txt"));
			out.writeObject(stu);
			out.close();
			System.out.println("�����ϣ�");*/
			
			//�����л�
			ObjectInputStream in = new ObjectInputStream(
										new FileInputStream("ObjectOutputStream.txt"));
			Object obj = in.readObject();
			Student stu2 = (Student)obj;
			System.out.println("��ȡ�����ݣ�" + stu2.getName() + "--" + stu2.getAge() + "--" + stu2.getSex());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
