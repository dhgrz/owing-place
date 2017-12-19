package com.itcast.demo15_工厂方法模式;

public class DogFactory implements IAnimalFactory {

	@Override
	public IAnimal getAnimal() {
		return new Dog();
	}

}
