package com.itcast.demo15_工厂方法模式;
/*
 * 工厂方法模式是基于简单工厂模式的：
 * 即实现了前端不需要实例化对象，由工厂提供，
 * 也实现了当新增一个新动物时，无需修改工厂类。
 * 
 * 如果需要增加新的动物，增加一个新的动物类，实现IAnimal接口，然后再增加一个工厂类，实现IAnimalFactory接口
 * 在主类中就可以使用了。任何工厂类的代码不用修改。
 * 弊端：使用的类太多。
 */
public class Demo {
	public static void main(String[] args) {
		IAnimalFactory fac1 = new DogFactory();//狗工厂
		IAnimalFactory fac2 = new CatFactory();//猫工厂
		
		IAnimal a = fac1.getAnimal();//Dog对象
		IAnimal b = fac2.getAnimal();//Cat对象
		
		a.eat();//
		b.eat();
		
		
	}
}
