package com.itcast.demo15_��������ģʽ;

public class DogFactory implements IAnimalFactory {

	@Override
	public IAnimal getAnimal() {
		return new Dog();
	}

}
