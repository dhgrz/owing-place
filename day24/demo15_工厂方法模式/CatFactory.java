package com.itcast.demo15_��������ģʽ;

public class CatFactory implements IAnimalFactory {

	@Override
	public IAnimal getAnimal() {
		return new Cat();
	}

}
