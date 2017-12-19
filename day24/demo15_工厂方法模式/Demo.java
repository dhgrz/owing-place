package com.itcast.demo15_��������ģʽ;
/*
 * ��������ģʽ�ǻ��ڼ򵥹���ģʽ�ģ�
 * ��ʵ����ǰ�˲���Ҫʵ���������ɹ����ṩ��
 * Ҳʵ���˵�����һ���¶���ʱ�������޸Ĺ����ࡣ
 * 
 * �����Ҫ�����µĶ������һ���µĶ����࣬ʵ��IAnimal�ӿڣ�Ȼ��������һ�������࣬ʵ��IAnimalFactory�ӿ�
 * �������оͿ���ʹ���ˡ��κι�����Ĵ��벻���޸ġ�
 * �׶ˣ�ʹ�õ���̫�ࡣ
 */
public class Demo {
	public static void main(String[] args) {
		IAnimalFactory fac1 = new DogFactory();//������
		IAnimalFactory fac2 = new CatFactory();//è����
		
		IAnimal a = fac1.getAnimal();//Dog����
		IAnimal b = fac2.getAnimal();//Cat����
		
		a.eat();//
		b.eat();
		
		
	}
}
