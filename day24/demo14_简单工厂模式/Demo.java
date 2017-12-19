package com.itcast.demo14_简单工厂模式;
/*
 * 简单工厂模式：需要一个工厂，工厂生产产品。   用户如果需要使用产品，                   不用自己造，通过工厂获取。
 *           工厂类           某些特定对象           程序中如果需要某个对象             不用自己创建，通过工厂对象获得。
 *           
 * 好处：前段使用者不需要自己创建对象，由工厂去统一创建，前端只需要调用工厂的方法获取对象就可以。
 * 弊端：当增加新的动物时，要修改工厂类。
 */
public class Demo {
	public static void main(String[] args) {
		//这种方式，需要什么对象，就自己实例化这个类的对象。
		/*Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.eat();
		cat.eat();*/
		
		//使用简单工厂--方式一，获取
		Dog dog = AnimalFactory.getDog();
		Cat cat = AnimalFactory.getCat();
		//简单工厂--方式二,获取
		Object obj = AnimalFactory.getAnimal("狗");//返回Dog
		Object obj2 = AnimalFactory.getAnimal("猫");//返回Cat
		//向下转型
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
