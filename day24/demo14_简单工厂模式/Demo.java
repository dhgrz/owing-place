package com.itcast.demo14_�򵥹���ģʽ;
/*
 * �򵥹���ģʽ����Ҫһ������������������Ʒ��   �û������Ҫʹ�ò�Ʒ��                   �����Լ��죬ͨ��������ȡ��
 *           ������           ĳЩ�ض�����           �����������Ҫĳ������             �����Լ�������ͨ�����������á�
 *           
 * �ô���ǰ��ʹ���߲���Ҫ�Լ����������ɹ���ȥͳһ������ǰ��ֻ��Ҫ���ù����ķ�����ȡ����Ϳ��ԡ�
 * �׶ˣ��������µĶ���ʱ��Ҫ�޸Ĺ����ࡣ
 */
public class Demo {
	public static void main(String[] args) {
		//���ַ�ʽ����Ҫʲô���󣬾��Լ�ʵ���������Ķ���
		/*Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.eat();
		cat.eat();*/
		
		//ʹ�ü򵥹���--��ʽһ����ȡ
		Dog dog = AnimalFactory.getDog();
		Cat cat = AnimalFactory.getCat();
		//�򵥹���--��ʽ��,��ȡ
		Object obj = AnimalFactory.getAnimal("��");//����Dog
		Object obj2 = AnimalFactory.getAnimal("è");//����Cat
		//����ת��
		if(obj instanceof Dog){
			Dog dog2 = (Dog)obj;
			dog2.eat();
		}
		if(obj2 instanceof Cat){
			Cat cat2 = (Cat)obj2;
			cat2.eat();
		}
		
	}
}
