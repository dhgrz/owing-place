package com.itcast.demo15_工厂方法模式;

public class CatFactory implements IAnimalFactory {

	@Override
	public IAnimal getAnimal() {
		return new Cat();
	}

}
