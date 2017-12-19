package com.itcast.demo14_简单工厂模式;
/*
 * 简单工厂模式：
 * 动物工厂类：
 * 
 * 方式一：为每一种对象分别提供方法
 * 	提供获取狗对象的方法
 *  提供获取猫对象的方法
 * 方式二：可以提供一个方法，提供一个标记，通过标记标示需要哪个对象，然后我返回哪个对象；
 */
public class AnimalFactory {
	//********方式一*************//
	public static Dog getDog(){
		return new Dog();
	}
	public static Cat getCat(){
		return new Cat();
	}
	//********方式二*************//
	public static Object getAnimal(String type){
		if(type.equals("狗")){
			return new Dog();
		}
		if(type.equals("猫")){
			return new Cat();
		}
		return null;
	}
}
